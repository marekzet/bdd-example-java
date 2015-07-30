package test.integration.runners;

import org.jbehave.core.Embeddable;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.FilePrintStreamFactory;
import org.jbehave.core.reporters.StoryReporterBuilder;
import test.integration.steps.PlacingOrderSteps;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Marek on 2015-04-23.
 */
public class PlacingOrderStepsRunner extends JUnitStories {
    public PlacingOrderStepsRunner() {
        super();
        this.configuredEmbedder().candidateSteps().add(new PlacingOrderSteps());
    }

    @Override
    protected List<String> storyPaths() {
        return Arrays.asList("test/integration/stories/PlacingOrderStory.story");
    }

    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration()
                .useStoryReporterBuilder(
                        new StoryReporterBuilder() {
                            public StoryReporterBuilder withDefaultFormats() {
                                return withFormats(Format.STATS, Format.TXT);
                            }
                        }
                );
    }
}
