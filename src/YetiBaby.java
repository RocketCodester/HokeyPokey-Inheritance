
import org.lgna.story.resources.biped.YetiBabyResource;
import org.lgna.story.*;

public class YetiBaby extends Biped {
    @Override
    public void turnAround() {
        this.turn(TurnDirection.LEFT, 5.0, Turn.duration(5.0));
        this.delay(2.0);
    }
    public YetiBaby(final YetiBabyResource resource) {
        super(resource);
    }

    public void setYetiBabyResource(final YetiBabyResource yetiBabyResource) {
        this.setJointedModelResource(yetiBabyResource);
    }
}
