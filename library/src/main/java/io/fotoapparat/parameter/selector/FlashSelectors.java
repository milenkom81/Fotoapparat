package io.fotoapparat.parameter.selector;

import java.util.Collection;

import io.fotoapparat.parameter.Flash;

/**
 * Selector functions for {@link io.fotoapparat.parameter.Flash}.
 */
public class FlashSelectors {

	/**
	 * @return function which selects given {@link Flash} from the list if it is available. If it is
	 * not available or flash unit is not available - provides {@code null}.
	 */
	public static SelectorFunction<Flash> flash(final Flash flash) {
		return new SelectorFunction<Flash>() {
			@Override
			public Flash select(Collection<Flash> items) {
				return items.contains(flash)
						? flash
						: null;
			}
		};
	}

}
