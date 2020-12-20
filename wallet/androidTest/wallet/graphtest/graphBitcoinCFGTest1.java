package wallet.graphtest;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.DataInteraction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.rule.GrantPermissionRule;
import androidx.test.runner.AndroidJUnit4;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import de.schildbach.wallet.R;
import de.schildbach.wallet.ui.WalletActivity;

import static androidx.test.InstrumentationRegistry.getInstrumentation;
import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class graphBitcoinCFGTest1 {

    @Rule
    public ActivityTestRule<WalletActivity> mActivityTestRule = new ActivityTestRule<>(WalletActivity.class);

    @Rule
    public GrantPermissionRule mGrantPermissionRule =
            GrantPermissionRule.grant(
                    "android.permission.CAMERA");

    @Test
    public void walletActivityEFGTest1() {
        ViewInteraction button = onView(
                allOf(withId(android.R.id.button2), withText("Dismiss"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                2)));
        button.perform(scrollTo(), click());

        ViewInteraction linearLayout = onView(
                allOf(withId(R.id.wallet_balance),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.wallet_balance_fragment),
                                        0),
                                0),
                        isDisplayed()));
        linearLayout.perform(click());

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

        ViewInteraction cardView = onView(
                allOf(withId(R.id.bitcoin_address_qr_card),
                        childAtPosition(
                                allOf(withId(R.id.wallet_address_fragment),
                                        childAtPosition(
                                                withClassName(is("de.schildbach.wallet.util.FillGapsLinearLayout")),
                                                1)),
                                0),
                        isDisplayed()));
        cardView.perform(click());

        ViewInteraction actionMenuItemView = onView(
                allOf(withId(R.id.wallet_options_address_book), withContentDescription("Address book"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.Toolbar")),
                                        1),
                                0),
                        isDisplayed()));
        actionMenuItemView.perform(click());

        ViewInteraction actionMenuItemView2 = onView(
                allOf(withId(R.id.sending_addresses_options_scan), withContentDescription("Scan address"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.Toolbar")),
                                        2),
                                0),
                        isDisplayed()));
        actionMenuItemView2.perform(click());

        ViewInteraction imageButton2 = onView(
                allOf(withContentDescription("Navigate up"),
                        childAtPosition(
                                allOf(withClassName(is("android.widget.Toolbar")),
                                        childAtPosition(
                                                withClassName(is("com.android.internal.widget.ActionBarContainer")),
                                                0)),
                                0),
                        isDisplayed()));
        imageButton2.perform(click());

        pressBack();

        ViewInteraction actionMenuItemView3 = onView(
                allOf(withId(R.id.wallet_transactions_options_filter), withContentDescription("Filter"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.Toolbar")),
                                        1),
                                1),
                        isDisplayed()));
        actionMenuItemView3.perform(click());

        ViewInteraction textView = onView(
                allOf(withId(android.R.id.title), withText("Received payments"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        textView.perform(click());

        ViewInteraction actionMenuItemView4 = onView(
                allOf(withId(R.id.wallet_transactions_options_filter), withContentDescription("Filter"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.Toolbar")),
                                        1),
                                1),
                        isDisplayed()));
        actionMenuItemView4.perform(click());

        ViewInteraction textView2 = onView(
                allOf(withId(android.R.id.title), withText("Sent payments"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        textView2.perform(click());

        ViewInteraction actionMenuItemView5 = onView(
                allOf(withId(R.id.wallet_transactions_options_filter), withContentDescription("Filter"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.Toolbar")),
                                        1),
                                1),
                        isDisplayed()));
        actionMenuItemView5.perform(click());

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());

        ViewInteraction textView3 = onView(
                allOf(withId(android.R.id.title), withText("Exchange rates"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        textView3.perform(click());

        ViewInteraction actionMenuItemView6 = onView(
                allOf(withId(R.id.exchange_rates_options_search), withContentDescription("Search exchange rate"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.Toolbar")),
                                        3),
                                0),
                        isDisplayed()));
        actionMenuItemView6.perform(click());

        ViewInteraction searchAutoComplete = onView(
                allOf(withClassName(is("android.widget.SearchView$SearchAutoComplete")),
                        childAtPosition(
                                allOf(withClassName(is("android.widget.LinearLayout")),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                1)),
                                0),
                        isDisplayed()));
        searchAutoComplete.perform(replaceText("123gjk"), closeSoftKeyboard());

        ViewInteraction searchAutoComplete2 = onView(
                allOf(withClassName(is("android.widget.SearchView$SearchAutoComplete")), withText("123gjk"),
                        childAtPosition(
                                allOf(withClassName(is("android.widget.LinearLayout")),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                1)),
                                0),
                        isDisplayed()));
        searchAutoComplete2.perform(pressImeActionButton());

        ViewInteraction imageButton3 = onView(
                allOf(withContentDescription("Collapse"),
                        childAtPosition(
                                allOf(withClassName(is("android.widget.Toolbar")),
                                        childAtPosition(
                                                withClassName(is("com.android.internal.widget.ActionBarContainer")),
                                                0)),
                                1),
                        isDisplayed()));
        imageButton3.perform(click());

        ViewInteraction imageButton4 = onView(
                allOf(withContentDescription("Navigate up"),
                        childAtPosition(
                                allOf(withClassName(is("android.widget.Toolbar")),
                                        childAtPosition(
                                                withClassName(is("com.android.internal.widget.ActionBarContainer")),
                                                0)),
                                1),
                        isDisplayed()));
        imageButton4.perform(click());

        pressBack();

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());

        ViewInteraction textView4 = onView(
                allOf(withId(android.R.id.title), withText("Safety"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        textView4.perform(click());

        ViewInteraction textView5 = onView(
                allOf(withId(android.R.id.title), withText("Safety notes"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        textView5.perform(click());

        ViewInteraction button2 = onView(
                allOf(withId(android.R.id.button3), withText("Dismiss"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                0)));
        button2.perform(scrollTo(), click());

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());

        ViewInteraction textView6 = onView(
                allOf(withId(android.R.id.title), withText("Settings"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        textView6.perform(click());

        DataInteraction linearLayout2 = onData(anything())
                .inAdapterView(allOf(withId(android.R.id.list),
                        childAtPosition(
                                withClassName(is("android.widget.LinearLayout")),
                                0)))
                .atPosition(0);
        linearLayout2.perform(click());

        ViewInteraction imageButton5 = onView(
                allOf(withContentDescription("Navigate up"),
                        childAtPosition(
                                allOf(withClassName(is("android.widget.Toolbar")),
                                        childAtPosition(
                                                withClassName(is("com.android.internal.widget.ActionBarContainer")),
                                                0)),
                                0),
                        isDisplayed()));
        imageButton5.perform(click());

        ViewInteraction imageButton6 = onView(
                allOf(withContentDescription("Navigate up"),
                        childAtPosition(
                                allOf(withClassName(is("android.widget.Toolbar")),
                                        childAtPosition(
                                                withClassName(is("com.android.internal.widget.ActionBarContainer")),
                                                0)),
                                0),
                        isDisplayed()));
        imageButton6.perform(click());

        pressBack();

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());

        ViewInteraction textView7 = onView(
                allOf(withId(android.R.id.title), withText("Report issue"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        textView7.perform(click());

        ViewInteraction button3 = onView(
                allOf(withId(android.R.id.button2), withText("Cancel"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                2)));
        button3.perform(scrollTo(), click());

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());

        ViewInteraction textView8 = onView(
                allOf(withId(android.R.id.title), withText("Request to legacy address"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        textView8.perform(click());

        ViewInteraction editText = onView(
                allOf(withId(R.id.request_coins_amount_btc_edittext),
                        childAtPosition(
                                allOf(withId(R.id.request_coins_amount_btc),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                0),
                        isDisplayed()));
        editText.perform(replaceText("65"), closeSoftKeyboard());

        ViewInteraction cardView2 = onView(
                allOf(withId(R.id.request_coins_qr_card),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                1)));
        cardView2.perform(scrollTo(), click());

        ViewInteraction imageButton7 = onView(
                allOf(withContentDescription("Navigate up"),
                        childAtPosition(
                                allOf(withClassName(is("android.widget.Toolbar")),
                                        childAtPosition(
                                                withClassName(is("com.android.internal.widget.ActionBarContainer")),
                                                0)),
                                0),
                        isDisplayed()));
        imageButton7.perform(click());

        pressBack();

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());

        ViewInteraction textView9 = onView(
                allOf(withId(android.R.id.title), withText("Report issue"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        textView9.perform(click());

        ViewInteraction button4 = onView(
                allOf(withId(android.R.id.button2), withText("Cancel"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                2)));
        button4.perform(scrollTo(), click());

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());

        ViewInteraction textView10 = onView(
                allOf(withId(android.R.id.title), withText("Help"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        textView10.perform(click());

        ViewInteraction button5 = onView(
                allOf(withId(android.R.id.button3), withText("Dismiss"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                0)));
        button5.perform(scrollTo(), click());
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
