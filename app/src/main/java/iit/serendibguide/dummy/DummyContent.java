package iit.serendibguide.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 3;

    static {
        // Add some sample items.
        addItem(new DummyItem("1","Description","Sigiriya is famous for its palace ruins on top of a massive 200 meter high rock surrounded by the remains of an extensive network of gardens, reservoirs and other structures. The rock itself is a lava plug left over from an ancient long extinct volcano. It is also renowned for its ancient paintings (frescoes), which are similar to those found at Ajanta Caves in India. It is generally agreed, however, that the Sigiriya Frescoes exhibit a uniquely Sri Lankan style.\n" +
                "\n" +
                "Sigiriya may have been inhabited through prehistoric times. It was used as a rock-shelter mountain monastery from about the 5th century BC, with caves prepared and donated by devotees of the Buddhist Sangha."));

        addItem(new DummyItem("2","Buy Tickets","Tickets can be bought at the premises and will approximately cost USD $ 30. The ideal time to visit Sigiriya would be Early Morning. Be sure to be there early to avoid huge ques and make sure you don't miss the amazing sunrise. "));
        addItem(new DummyItem("3","Find a Guide","Sigiriya is full of misteries and hidden stories. So you will definitely require an expert to explore with you. Usually guiding without a proper permit is prohibited in Sigiriya. Even Chauffeur Guides aren't allowed to explain the landmarks in Sigiriya. You will find Guides who speak several languages at the tickets counters. They'll be wearing official tags. Be sure to hire one with proper permit. A guide usually cost arount USD $ 20.  "));
        addItem(new DummyItem("4","Find a place to Eat","Dining at a Hotel will be expensive. So always try to find good restaurants on the go. There's no harm in trying different cuisine. Sigiriya is famous for restaurants serving traditional Sri Lankan food. You will find countless options around the area. Just post a question on the chat forums or check out the ratings in our app. "));

    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
