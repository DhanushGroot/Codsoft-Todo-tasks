package com.example.quotetheday;

import java.util.Random;

public class QuoteGenerator {

    private static final String[] QUOTES = {
            "The only way to do great work is to love what you do. - Steve Jobs",
            "Strive not to be a success, but rather to be of value. - Albert Einstein",
            "The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt",
            "Don't watch the clock; do what it does. Keep going. - Sam Levenson",
            "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill",
            "The only limit to our realization of tomorrow will be our doubts of today. - Franklin D. Roosevelt",
            "Your time is limited, don't waste it living someone else's life. - Steve Jobs",
            "The greatest glory in living lies not in never falling, but in rising every time we fall. - Nelson Mandela",
            "Success is stumbling from failure to failure with no loss of enthusiasm. - Winston S. Churchill",
            "Don't cry because it's over, smile because it happened. - Dr. Seuss",
            "The only person you are destined to become is the person you decide to be. - Ralph Waldo Emerson",
            "In the middle of difficulty lies opportunity. - Albert Einstein",
            "Believe you can and you're halfway there. - Theodore Roosevelt",
            "Do not wait to strike till the iron is hot, but make it hot by striking. - William Butler Yeats",
            "It is never too late to be what you might have been. - George Eliot",
            "The best way to predict the future is to create it. - Peter Drucker",
            "Believe in yourself and all that you are. Know that there is something inside you that is greater than any obstacle. - Christian D. Larson",
            "Success is not the key to happiness. Happiness is the key to success. If you love what you are doing, you will be successful. - Albert Schweitzer",
            "The only thing standing between you and your goal is the story you keep telling yourself as to why you can't achieve it. - Jordan Belfort",
            "Do not dwell in the past, do not dream of the future, concentrate the mind on the present moment. - Buddha",
            "The difference between a successful person and others is not a lack of strength, not a lack of knowledge, but rather a lack in will. - Vince Lombardi",
            "If you want to achieve greatness stop asking for permission. - Anonymous",
            "I find that the harder I work, the more luck I seem to have. - Thomas Jefferson",
            "The only place where success comes before work is in the dictionary. - Vidal Sassoon",
            "The way to get started is to quit talking and begin doing. - Walt Disney",
            "Don't be pushed around by the fears in your mind. Be led by the dreams in your heart. - Roy T. Bennett",
            "The only limit to our realization of tomorrow will be our doubts of today. - Franklin D. Roosevelt",
            "You miss 100% of the shots you don't take. - Wayne Gretzky",
            "Don't be afraid to give up the good to go for the great. - John D. Rockefeller",
            "Success is not in what you have, but who you are. - Bo Bennett",
            "The best revenge is massive success. - Frank Sinatra",
            "The only person you are destined to become is the person you decide to be. - Ralph Waldo Emerson",
            "Don't let yesterday take up too much of today. - Will Rogers",
            "Your work is going to fill a large part of your life, and the only way to be truly satisfied is to do what you believe is great work. - Steve Jobs",
            "The purpose of our lives is to be happy. - Dalai Lama",
            "Success is liking yourself, liking what you do, and liking how you do it. - Maya Angelou",
            "I attribute my success to this: I never gave or took any excuse. - Florence Nightingale",
            "The best way to predict your future is to create it. - Peter Drucker",
            "You have within you right now, everything you need to deal with whatever the world can throw at you. - Brian Tracy",
            "It is never too late to be what you might have been. - George Eliot",
            "Success is not just about making money. It's about making a difference. - Unknown",
            "Your time is limited, don't waste it living someone else's life. - Steve Jobs",
            "Success is a journey, not a destination. The doing is often more important than the outcome. - Arthur Ashe",
            "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill",
            "Life is 10% what happens to us and 90% how we react to it. - Charles R. Swindoll",
            "Believe you can and you're halfway there. - Theodore Roosevelt",
            "Don't watch the clock; do what it does. Keep going. - Sam Levenson",
            "Do not wait to strike till the iron is hot, but make it hot by striking. - William Butler Yeats",
            "The best way to predict the future is to create it. - Peter Drucker",
            "You are never too old to set another goal or to dream a new dream. - C.S. Lewis"
    };

    public static String getRandomQuote() {
        Random random = new Random();
        int index = random.nextInt(QUOTES.length);
        return QUOTES[index];
    }
}
