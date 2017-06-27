package com.pieisnotpi.artoff;

import com.pieisnotpi.artoff.types.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main extends Application
{
    private static final List<Adjective> ADJECTIVES = new ArrayList<>();
    private static final List<Noun> NOUNS = new ArrayList<>();
    private static final List<Prompt> PROMPTS = new ArrayList<>();
    private static final Random random = new Random();
    public static List<String> PREFIXES;
    private static List<Noun> nounSubmit = new ArrayList<>();
    private static List<Adjective> adjSubmit = new ArrayList<>();

    public static void main(String[] args)
    {
        List<String> strings;

        if(new File("options").mkdir()) System.out.println("Options folder created");

        strings = OptionsHandler.getStrings("options/adjectives.txt", Defaults.adjectives);
        for(String string : strings) ADJECTIVES.add(new Adjective(string));
        strings = OptionsHandler.getStrings("options/nouns.txt", Defaults.nouns);
        for(String string : strings) NOUNS.add(new Noun(string));
        strings = OptionsHandler.getStrings("options/prompts.txt", Defaults.prompts);
        for(String string : strings) PROMPTS.add(new Prompt(string));
        PREFIXES = OptionsHandler.getStrings("options/prefixes.txt", Defaults.prefixes);

        launch();
    }

    @Override
    public void start(Stage stage) throws Exception
    {
        FlowPane pane = new FlowPane(0, 48);
        Scene scene = new Scene(pane);

        Text promptText = new Text("Click the button");
        Button generateButton = new Button("Generate Prompt");

        HBox promptBox = new HBox(promptText), generateBox = new HBox(generateButton);
        Border generateBorder = new Border(new BorderStroke(Paint.valueOf("black"), BorderStrokeStyle.SOLID, new CornerRadii(3), new BorderWidths(2)));

        promptText.setFont(Font.font(36));
        promptText.setWrappingWidth(512);
        promptText.setTextAlignment(TextAlignment.CENTER);

        generateButton.setOnAction((ae) -> promptText.setText(generatePrompt()));
        generateButton.setPrefWidth(256);
        generateButton.setPrefHeight(128);
        generateButton.setFont(Font.font(24));
        generateButton.setOnMousePressed((ae) -> pane.requestFocus());
        generateButton.setOnMouseEntered((ae) -> generateButton.setBorder(generateBorder));
        generateButton.setOnMouseExited((ae) -> generateButton.setBorder(Border.EMPTY));

        promptBox.setAlignment(Pos.TOP_CENTER);
        generateBox.setAlignment(Pos.BOTTOM_CENTER);

        pane.setOrientation(Orientation.VERTICAL);
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(32, 64, 32, 64));
        pane.getChildren().addAll(promptBox, generateBox);
        pane.requestFocus();

        stage.setWidth(640);
        stage.setHeight(540);
        stage.setScene(scene);
        stage.setTitle("Art-Off");
        stage.show();
    }

    private static String generatePrompt()
    {
        Prompt p = PROMPTS.get(randomInt(0, PROMPTS.size() - 1));
        return p.getFinalPrompt(getNouns(p.getNounCount()), getAdjectives(p.getAdjCount()));
    }

    private static List<Noun> getNouns(int count)
    {
        nounSubmit.clear();

        for(int i = 0; i < count; i++)
        {
            Noun n;
            do n = NOUNS.get(randomInt(0, NOUNS.size() - 1));
            while(nounSubmit.contains(n));
            nounSubmit.add(n);
        }

        return nounSubmit;
    }

    private static List<Adjective> getAdjectives(int count)
    {
        adjSubmit.clear();

        for(int i = 0; i < count; i++)
        {
            Adjective a;
            do a = ADJECTIVES.get(randomInt(0, ADJECTIVES.size() - 1));
            while(adjSubmit.contains(a));
            adjSubmit.add(a);
        }

        return adjSubmit;
    }

    private static int randomInt(int min, int max)
    {
        return random.nextInt((max - min + 1) + min);
    }
}
