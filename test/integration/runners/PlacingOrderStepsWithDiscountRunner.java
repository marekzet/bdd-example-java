package test.integration.runners;

import org.jbehave.core.junit.JUnitStories;
import test.integration.steps.PlacingOrderWithDiscountSteps;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Marek on 2015-04-23.
 */
public class PlacingOrderStepsWithDiscountRunner extends JUnitStories {

    public PlacingOrderStepsWithDiscountRunner() {
        super();
        this.configuredEmbedder().candidateSteps().add(new PlacingOrderWithDiscountSteps());
    }

    @Override
    protected List<String> storyPaths() {
        return Arrays.asList("test/integration/stories/PlacingOrderWithDiscountStory.story");
    }
}
