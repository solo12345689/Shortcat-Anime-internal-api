.class public final enum Lexpo/modules/video/enums/FullscreenOrientation;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lexpo/modules/kotlin/types/Enumerable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/video/enums/FullscreenOrientation$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lexpo/modules/video/enums/FullscreenOrientation;",
        ">;",
        "Lexpo/modules/kotlin/types/Enumerable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0000\u0008\u0086\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0012"
    }
    d2 = {
        "Lexpo/modules/video/enums/FullscreenOrientation;",
        "Lexpo/modules/kotlin/types/Enumerable;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "LANDSCAPE",
        "PORTRAIT",
        "LANDSCAPE_LEFT",
        "LANDSCAPE_RIGHT",
        "PORTRAIT_UP",
        "PORTRAIT_DOWN",
        "DEFAULT",
        "toActivityOrientation",
        "",
        "expo-video_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lexpo/modules/video/enums/FullscreenOrientation;

.field public static final enum DEFAULT:Lexpo/modules/video/enums/FullscreenOrientation;

.field public static final enum LANDSCAPE:Lexpo/modules/video/enums/FullscreenOrientation;

.field public static final enum LANDSCAPE_LEFT:Lexpo/modules/video/enums/FullscreenOrientation;

.field public static final enum LANDSCAPE_RIGHT:Lexpo/modules/video/enums/FullscreenOrientation;

.field public static final enum PORTRAIT:Lexpo/modules/video/enums/FullscreenOrientation;

.field public static final enum PORTRAIT_DOWN:Lexpo/modules/video/enums/FullscreenOrientation;

.field public static final enum PORTRAIT_UP:Lexpo/modules/video/enums/FullscreenOrientation;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lexpo/modules/video/enums/FullscreenOrientation;
    .locals 7

    .line 1
    sget-object v0, Lexpo/modules/video/enums/FullscreenOrientation;->LANDSCAPE:Lexpo/modules/video/enums/FullscreenOrientation;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/video/enums/FullscreenOrientation;->PORTRAIT:Lexpo/modules/video/enums/FullscreenOrientation;

    .line 4
    .line 5
    sget-object v2, Lexpo/modules/video/enums/FullscreenOrientation;->LANDSCAPE_LEFT:Lexpo/modules/video/enums/FullscreenOrientation;

    .line 6
    .line 7
    sget-object v3, Lexpo/modules/video/enums/FullscreenOrientation;->LANDSCAPE_RIGHT:Lexpo/modules/video/enums/FullscreenOrientation;

    .line 8
    .line 9
    sget-object v4, Lexpo/modules/video/enums/FullscreenOrientation;->PORTRAIT_UP:Lexpo/modules/video/enums/FullscreenOrientation;

    .line 10
    .line 11
    sget-object v5, Lexpo/modules/video/enums/FullscreenOrientation;->PORTRAIT_DOWN:Lexpo/modules/video/enums/FullscreenOrientation;

    .line 12
    .line 13
    sget-object v6, Lexpo/modules/video/enums/FullscreenOrientation;->DEFAULT:Lexpo/modules/video/enums/FullscreenOrientation;

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Lexpo/modules/video/enums/FullscreenOrientation;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lexpo/modules/video/enums/FullscreenOrientation;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "landscape"

    .line 5
    .line 6
    const-string v3, "LANDSCAPE"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/video/enums/FullscreenOrientation;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lexpo/modules/video/enums/FullscreenOrientation;->LANDSCAPE:Lexpo/modules/video/enums/FullscreenOrientation;

    .line 12
    .line 13
    new-instance v0, Lexpo/modules/video/enums/FullscreenOrientation;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "portrait"

    .line 17
    .line 18
    const-string v3, "PORTRAIT"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/video/enums/FullscreenOrientation;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lexpo/modules/video/enums/FullscreenOrientation;->PORTRAIT:Lexpo/modules/video/enums/FullscreenOrientation;

    .line 24
    .line 25
    new-instance v0, Lexpo/modules/video/enums/FullscreenOrientation;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "landscapeLeft"

    .line 29
    .line 30
    const-string v3, "LANDSCAPE_LEFT"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/video/enums/FullscreenOrientation;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lexpo/modules/video/enums/FullscreenOrientation;->LANDSCAPE_LEFT:Lexpo/modules/video/enums/FullscreenOrientation;

    .line 36
    .line 37
    new-instance v0, Lexpo/modules/video/enums/FullscreenOrientation;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "landscapeRight"

    .line 41
    .line 42
    const-string v3, "LANDSCAPE_RIGHT"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/video/enums/FullscreenOrientation;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lexpo/modules/video/enums/FullscreenOrientation;->LANDSCAPE_RIGHT:Lexpo/modules/video/enums/FullscreenOrientation;

    .line 48
    .line 49
    new-instance v0, Lexpo/modules/video/enums/FullscreenOrientation;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    const-string v2, "portraitUp"

    .line 53
    .line 54
    const-string v3, "PORTRAIT_UP"

    .line 55
    .line 56
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/video/enums/FullscreenOrientation;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lexpo/modules/video/enums/FullscreenOrientation;->PORTRAIT_UP:Lexpo/modules/video/enums/FullscreenOrientation;

    .line 60
    .line 61
    new-instance v0, Lexpo/modules/video/enums/FullscreenOrientation;

    .line 62
    .line 63
    const/4 v1, 0x5

    .line 64
    const-string v2, "portraitDown"

    .line 65
    .line 66
    const-string v3, "PORTRAIT_DOWN"

    .line 67
    .line 68
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/video/enums/FullscreenOrientation;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lexpo/modules/video/enums/FullscreenOrientation;->PORTRAIT_DOWN:Lexpo/modules/video/enums/FullscreenOrientation;

    .line 72
    .line 73
    new-instance v0, Lexpo/modules/video/enums/FullscreenOrientation;

    .line 74
    .line 75
    const/4 v1, 0x6

    .line 76
    const-string v2, "default"

    .line 77
    .line 78
    const-string v3, "DEFAULT"

    .line 79
    .line 80
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/video/enums/FullscreenOrientation;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lexpo/modules/video/enums/FullscreenOrientation;->DEFAULT:Lexpo/modules/video/enums/FullscreenOrientation;

    .line 84
    .line 85
    invoke-static {}, Lexpo/modules/video/enums/FullscreenOrientation;->$values()[Lexpo/modules/video/enums/FullscreenOrientation;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sput-object v0, Lexpo/modules/video/enums/FullscreenOrientation;->$VALUES:[Lexpo/modules/video/enums/FullscreenOrientation;

    .line 90
    .line 91
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sput-object v0, Lexpo/modules/video/enums/FullscreenOrientation;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 96
    .line 97
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lexpo/modules/video/enums/FullscreenOrientation;->value:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries;"
        }
    .end annotation

    .line 1
    sget-object v0, Lexpo/modules/video/enums/FullscreenOrientation;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/video/enums/FullscreenOrientation;
    .locals 1

    .line 1
    const-class v0, Lexpo/modules/video/enums/FullscreenOrientation;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lexpo/modules/video/enums/FullscreenOrientation;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lexpo/modules/video/enums/FullscreenOrientation;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/video/enums/FullscreenOrientation;->$VALUES:[Lexpo/modules/video/enums/FullscreenOrientation;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lexpo/modules/video/enums/FullscreenOrientation;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/enums/FullscreenOrientation;->value:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final toActivityOrientation()I
    .locals 2

    .line 1
    sget-object v0, Lexpo/modules/video/enums/FullscreenOrientation$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, LTd/r;

    .line 13
    .line 14
    invoke-direct {v0}, LTd/r;-><init>()V

    .line 15
    .line 16
    .line 17
    throw v0

    .line 18
    :pswitch_0
    const/4 v0, -0x1

    .line 19
    return v0

    .line 20
    :pswitch_1
    const/16 v0, 0x9

    .line 21
    .line 22
    return v0

    .line 23
    :pswitch_2
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :pswitch_3
    const/16 v0, 0x8

    .line 26
    .line 27
    return v0

    .line 28
    :pswitch_4
    const/4 v0, 0x0

    .line 29
    return v0

    .line 30
    :pswitch_5
    const/16 v0, 0xc

    .line 31
    .line 32
    return v0

    .line 33
    :pswitch_6
    const/16 v0, 0xb

    .line 34
    .line 35
    return v0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
