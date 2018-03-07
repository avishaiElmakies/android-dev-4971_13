package anna.karp;

import java.util.ArrayList;

public class Repository {

    public static ArrayList<Animal> getAnimals() {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Animal("Bunny", "The Bunny is a harmless Critter. Bunnies usually spawn only in the middle-third of the above-ground world, and only on ordinary Grass, though they can also spawn near NPCs in other locations"));
        animals.add(new Animal("Chameleon", "Chameleons or chamaeleons (family Chamaeleonidae) are a distinctive and highly specialized clade of Old World lizards with 202 species described as of June 2015. These species come in a range of colors, and many species have the ability to change colors."));
        animals.add(new Animal("Deer", "Deer (singular and plural) are the ruminant mammals forming the family Cervidae. The two main groups are the Cervinae, including the muntjac, the fallow deer and the chital, and the Capreolinae, including the elk, reindeer (caribou), the Western roe deer, and the Eurasian elk (moose)."));
        animals.add(new Animal("Duckling", "Duck is the common name for a large number of species in the waterfowl family Anatidae, which also includes swans and geese."));
        animals.add(new Animal("Elephant", "Elephants are large mammals of the family Elephantidae and the order Proboscidea. Two species are traditionally recognised, the African elephant (Loxodonta africana) and the Asian elephant (Elephas maximus), although some evidence suggests that African bush elephants and African forest elephants are separate species (L. africana and L. cyclotis respectively)."));
        animals.add(new Animal("Giraffe", "The giraffe (Giraffa) is a genus of African even-toed ungulate mammals, the tallest living terrestrial animals and the largest ruminants."));
        animals.add(new Animal("Kitten", "A kitten (also known as a kitty or kitty cat) is a juvenile cat. After being born, kittens are totally dependent on their mother for survival and they do not normally open their eyes until after seven to ten days."));
        animals.add(new Animal("Owl", "Marina and Ira Eliahu are also types of Owls ;-) Owls are birds from the order Strigiformes, which includes about 200 species of mostly solitary and nocturnal birds of prey typified by an upright stance, a large, broad head, binocular vision, binaural hearing, sharp talons, and feathers adapted for silent flight. Exceptions include the diurnal northern hawk-owl and the gregarious burrowing owl."));
        animals.add(new Animal("Panda", "The giant panda bear is found at the top of the Yangtze Basin. Its range is confined to small remote mountain areas in the central China provinces of Sichuan, Gansus, and Shaanxi. Its population is declining since its original habitat has been reduced to a mere fraction due to deforestation, farming, global warming, poaching, hunting dogs, and other activities related to mankind."));
        animals.add(new Animal("Puppy", "A puppy is a juvenile dog. Some puppies can weigh 1–3 lb (0.45–1.36 kg), while larger ones can weigh up to 15–23 lb (6.8–10.4 kg). All healthy puppies grow quickly after birth. A puppy's coat color may change as the puppy grows older, as is commonly seen in breeds such as the Yorkshire Terrier."));

        return animals;
    }

}
