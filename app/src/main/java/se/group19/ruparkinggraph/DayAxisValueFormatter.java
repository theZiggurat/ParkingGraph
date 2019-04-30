package se.group19.ruparkinggraph;

import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.formatter.ValueFormatter;

public class DayAxisValueFormatter extends ValueFormatter {

    private final String[] daysOfWeek = new String[]{
            "Mon", "Tues", "Weds", "Thurs", "Fri"
    };


    public DayAxisValueFormatter(BarLineChartBase<?> chart) {
    }

    @Override
    public String getFormattedValue(float value) {
        return daysOfWeek[((int)value)%5];
    }
}
