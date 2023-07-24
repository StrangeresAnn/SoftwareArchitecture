package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

public class ModelStore implements IModelChanger {
    public PoligonalModel Models;
    public Scene Scenes;
    public Flash Flashes;
    public Camera Cameras;
    private IModelChangedObserver changeObservers;

    public Scene getScenes(int sceneNum) {
        return Scenes;
    }
    public NotifyChange(IModelChanger sender) {
    }
}
