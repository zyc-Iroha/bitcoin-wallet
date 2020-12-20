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

import static androidx.test.InstrumentationRegistry.getInstrumentation;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class graphBitcoinCFGTest3 {

    @Rule
    public ActivityTestRule<WalletActivity> mActivityTestRule = new ActivityTestRule<>(WalletActivity.class);

    @Test
    public void walletActivityEFGTest2() {
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

        ViewInteraction editText = onView(
                allOf(withId(R.id.request_coins_amount_btc_edittext),
                        childAtPosition(
                                allOf(withId(R.id.request_coins_amount_btc),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                0),
                        isDisplayed()));
        editText.perform(replaceText("125"), closeSoftKeyboard());

        ViewInteraction cardView = onView(
                allOf(withId(R.id.request_coins_qr_card),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                1)));
        cardView.perform(scrollTo(), click());

        ViewInteraction actionMenuItemView = onView(
                allOf(withId(R.id.request_coins_options_copy), withContentDescription("Copy"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.Toolbar")),
                                        2),
                                0),
                        isDisplayed()));
        actionMenuItemView.perform(click());

        ViewInteraction actionMenuItemView2 = onView(
                allOf(withId(R.id.request_coins_options_share), withContentDescription("Share"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.Toolbar")),
                                        2),
                                1),
                        isDisplayed()));
        actionMenuItemView2.perform(click());

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());

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
        autoCompleteTextView.perform(replaceText("asd"), closeSoftKeyboard());

        ViewInteraction editText2 = onView(
                allOf(withId(R.id.send_coins_amount_btc_edittext),
                        childAtPosition(
                                allOf(withId(R.id.send_coins_amount_btc),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                0),
                        isDisplayed()));
        editText2.perform(replaceText("131"), closeSoftKeyboard());

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());

        ViewInteraction textView = onView(
                allOf(withId(android.R.id.title), withText("Fee"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        textView.perform(click());

        ViewInteraction textView2 = onView(
                allOf(withId(android.R.id.title), withText("Economic"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        textView2.perform(click());

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());

        ViewInteraction textView3 = onView(
                allOf(withId(android.R.id.title), withText("Empty wallet"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        textView3.perform(click());

        ViewInteraction editText3 = onView(
                allOf(withId(R.id.send_coins_amount_local_edittext),
                        childAtPosition(
                                allOf(withId(R.id.send_coins_amount_local),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                1)),
                                0),
                        isDisplayed()));
        editText3.perform(pressImeActionButton());

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

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());

        ViewInteraction textView4 = onView(
                allOf(withId(android.R.id.title), withText("Network monitor"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        textView4.perform(click());

        ViewInteraction imageButton3 = onView(
                allOf(withContentDescription("Navigate up"),
                        childAtPosition(
                                allOf(withClassName(is("android.widget.Toolbar")),
                                        childAtPosition(
                                                withClassName(is("com.android.internal.widget.ActionBarContainer")),
                                                0)),
                                0),
                        isDisplayed()));
        imageButton3.perform(click());

        pressBack();

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());

        ViewInteraction textView5 = onView(
                allOf(withId(android.R.id.title), withText("Sweep paper wallet"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        textView5.perform(click());

        ViewInteraction button4 = onView(
                allOf(withId(R.id.send_coins_cancel), withText("Cancel"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                0)));
        button4.perform(scrollTo(), click());

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());

        ViewInteraction textView6 = onView(
                allOf(withId(android.R.id.title), withText("Safety"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        textView6.perform(click());

        ViewInteraction textView7 = onView(
                allOf(withId(android.R.id.title), withText("Back up wallet"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        textView7.perform(click());

        ViewInteraction editText4 = onView(
                allOf(withId(R.id.backup_wallet_dialog_password),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                0)));
        editText4.perform(scrollTo(), replaceText("123"), closeSoftKeyboard());

        ViewInteraction editText5 = onView(
                allOf(withId(R.id.backup_wallet_dialog_password_again),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        2),
                                0)));
        editText5.perform(scrollTo(), replaceText("123"), closeSoftKeyboard());

        ViewInteraction checkBox = onView(
                allOf(withId(R.id.backup_wallet_dialog_show), withText("Show password"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                3)));
        checkBox.perform(scrollTo(), click());

        ViewInteraction button5 = onView(
                allOf(withId(android.R.id.button2), withText("Cancel"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                2)));
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
