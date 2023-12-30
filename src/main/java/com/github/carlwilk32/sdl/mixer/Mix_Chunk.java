package com.github.carlwilk32.sdl.mixer;

import com.github.carlwilk32.sdl.mixer.SDL_mixerLibrary.Uint32;
import com.github.carlwilk32.sdl.mixer.SDL_mixerLibrary.Uint8;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class Mix_Chunk extends Structure {
    public int allocated;

    /**
	 * C type : Uint8
	 */
    public Uint8 abuf;

    /**
	 * C type : Uint32
	 */
    public Uint32 alen;

    /**
     * Per-sample volume, 0-128<br>
     * C type : Uint8
     */
    public Uint8 volume;

    public Mix_Chunk() {
        super();
    }

    /**
     * @param abuf C type : Uint8*<br>
     * @param alen C type : Uint32<br>
     * @param volume Per-sample volume, 0-128<br>
     * C type : Uint8
     */
    public Mix_Chunk(int allocated, Uint8 abuf, Uint32 alen, Uint8 volume) {
        super();
        this.allocated = allocated;
        this.abuf = abuf;
        this.alen = alen;
        this.volume = volume;
    }

    public Mix_Chunk(Pointer peer) {
        super(peer);
    }

    protected List<String> getFieldOrder() {
        return Arrays.asList("allocated", "abuf", "alen", "volume");
    }

    public static class ByReference extends Mix_Chunk implements Structure.ByReference {
    }

    public static class ByValue extends Mix_Chunk implements Structure.ByValue {
    }
}
