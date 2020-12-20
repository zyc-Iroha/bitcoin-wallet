package wallet.graphtest;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import de.schildbach.wallet.R;
import de.schildbach.wallet.ui.WalletActivity;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class WalletActivityLogicTest1 {

    @Rule
    public ActivityTestRule<WalletActivity> mActivityTestRule = new ActivityTestRule<>(WalletActivity.class);

    @Test
    public void walletActivityLogicTest1() {
        ViewInteraction button = onView(
                allOf(withId(android.R.id.button2), withText("Dismiss"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                2)));
        button.perform(scrollTo(), click());

        ViewInteraction button2 = onView(
                allOf(withId(R.id.wallet_actions_request), withText("Request coins"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.wallet_actions_fragment),
                                        0),
                                0),
                        isDisplayed()));
        button2.perform(click());

        ViewInteraction imageButton = onView(
                allOf(withContentDescription("Navigate up"),
                        childAtPosition(
                                allOf(withClassName(is("android.widget.Toolbar")),
                                        childAtPosition(
                                                withClassName(is("com.android.internal.widget.ActionBarContainer")),
                                                0)),
                                0),
                        isDisplayed()));
        imageButton.perform(click());

        pressBack();

        ViewInteraction button3 = onView(
                allOf(withId(R.id.wallet_actions_send), withText("Send coins"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.wallet_actions_fragment),
                                        0),
                                2),
                        isDisplayed()));
        button3.perform(click());

        ViewInteraction autoCompleteTextView = onView(
                allOf(withId(R.id.send_coins_receiving_address),
                        childAtPosition(
                                allOf(withId(R.id.send_coins_payee_group),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                3),
                        isDisplayed()));
        autoCompleteTextView.perform(replaceText("fj"), closeSoftKeyboard());

        ViewInteraction editText = onView(
                allOf(withId(R.id.send_coins_amount_btc_edittext),
                        childAtPosition(
                                allOf(withId(R.id.send_coins_amount_btc),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                0),
                        isDisplayed()));
        editText.perform(click());

        ViewInteraction autoCompleteTextView2 = onView(
                allOf(withId(R.id.send_coins_receiving_address), withText("fj"),
                        childAtPosition(
                                allOf(withId(R.id.send_coins_payee_group),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                3),
                        isDisplayed()));
        autoCompleteTextView2.perform(replaceText("www.baidu.com"));

        ViewInteraction autoCompleteTextView3 = onView(
                allOf(withId(R.id.send_coins_receiving_address), withText("www.baidu.com"),
                        childAtPosition(
                                allOf(withId(R.id.send_coins_payee_group),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                3),
                        isDisplayed()));
        autoCompleteTextView3.perform(closeSoftKeyboard());

        ViewInteraction autoCompleteTextView4 = onView(
                allOf(withId(R.id.send_coins_receiving_address), withText("www.baidu.com"),
                        childAtPosition(
                                allOf(withId(R.id.send_coins_payee_group),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                3),
                        isDisplayed()));
        autoCompleteTextView4.perform(click());

        ViewInteraction autoCompleteTextView5 = onView(
                allOf(withId(R.id.send_coins_receiving_address), withText("www.baidu.com"),
                        childAtPosition(
                                allOf(withId(R.id.send_coins_payee_group),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                3),
                        isDisplayed()));
        autoCompleteTextView5.perform(longClick());

        ViewInteraction autoCompleteTextView6 = onView(
                allOf(withId(R.id.send_coins_receiving_address), withText("www.baidu.com"),
                        childAtPosition(
                                allOf(withId(R.id.send_coins_payee_group),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                3),
                        isDisplayed()));
        autoCompleteTextView6.perform(click());

        ViewInteraction autoCompleteTextView7 = onView(
                allOf(withId(R.id.send_coins_receiving_address), withText("www.baidu.com"),
                        childAtPosition(
                                allOf(withId(R.id.send_coins_payee_group),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                3),
                        isDisplayed()));
        autoCompleteTextView7.perform(click());

        ViewInteraction autoCompleteTextView8 = onView(
                allOf(withId(R.id.send_coins_receiving_address), withText("www.baidu.com"),
                        childAtPosition(
                                allOf(withId(R.id.send_coins_payee_group),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                3),
                        isDisplayed()));
        autoCompleteTextView8.perform(click());

        ViewInteraction autoCompleteTextView9 = onView(
                allOf(withId(R.id.send_coins_receiving_address), withText("www.baidu.com"),
                        childAtPosition(
                                allOf(withId(R.id.send_coins_payee_group),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                3),
                        isDisplayed()));
        autoCompleteTextView9.perform(longClick());

        ViewInteraction linearLayout = onView(
                allOf(withContentDescription("Copy"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.RelativeLayout")),
                                        0),
                                2),
                        isDisplayed()));
        linearLayout.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
