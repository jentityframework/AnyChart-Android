package com.anychart.core.stock.indicators;

import com.anychart.APIlib;
import com.anychart.JsObject;

import java.util.Locale;

// class
/**
 * Moving Average Convergence Divergence (MACD) indicator class.
{docs:Stock_Charts/Technical_Indicators/Moving_Average_Convergence_Divergence_(MACD)}Learn more about the MACD indicator.{docs}
 */
public class MACD extends JsObject {

    protected MACD() {

    }

    public static MACD instantiate() {
        return new MACD("new anychart.core.stock.indicators.mACD()");
    }

    

    public MACD(String jsChart) {
        jsBase = "mACD" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the current fast period.
     */
    public void fastPeriod() {
        APIlib.getInstance().addJSLine(jsBase + ".fastPeriod();");
    }
    /**
     * Setter for the fast period.
     */
    public com.anychart.core.stock.indicators.MACD fastPeriod(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fastPeriod(%s);", value));

        return this;
    }
    /**
     * Getter for the current indicator histogram series.
     */
    public com.anychart.core.stock.series.Base histogramSeries() {
        return new com.anychart.core.stock.series.Base(jsBase + ".histogramSeries()");
    }
    /**
     * Setter for the indicator histogram series.
     */
    public com.anychart.core.stock.indicators.MACD histogramSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".histogramSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator histogram series.
     */
    public com.anychart.core.stock.indicators.MACD histogramSeries(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".histogramSeries(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Getter for the current indicator MACD series.
     */
    public com.anychart.core.stock.series.Base macdSeries() {
        return new com.anychart.core.stock.series.Base(jsBase + ".macdSeries()");
    }
    /**
     * Setter for the indicator MACD series.
     */
    public com.anychart.core.stock.indicators.MACD macdSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".macdSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator MACD series.
     */
    public com.anychart.core.stock.indicators.MACD macdSeries(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".macdSeries(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Getter for the current signal period.
     */
    public void signalPeriod() {
        APIlib.getInstance().addJSLine(jsBase + ".signalPeriod();");
    }
    /**
     * Setter for the signal period.
     */
    public com.anychart.core.stock.indicators.MACD signalPeriod(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".signalPeriod(%s);", value));

        return this;
    }
    /**
     * Getter for the current signal series.
     */
    public com.anychart.core.stock.series.Base signalSeries() {
        return new com.anychart.core.stock.series.Base(jsBase + ".signalSeries()");
    }
    /**
     * Setter for the signal series.
     */
    public com.anychart.core.stock.indicators.MACD signalSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".signalSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the signal series.
     */
    public com.anychart.core.stock.indicators.MACD signalSeries(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".signalSeries(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Getter for the current slow period.
     */
    public void slowPeriod() {
        APIlib.getInstance().addJSLine(jsBase + ".slowPeriod();");
    }
    /**
     * Getter and setter for the slow period.
     */
    public com.anychart.core.stock.indicators.MACD slowPeriod(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".slowPeriod(%s);", value));

        return this;
    }

}