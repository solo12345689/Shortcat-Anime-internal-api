.class public final enum Lexpo/modules/video/enums/DRMType;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lexpo/modules/kotlin/types/Enumerable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/video/enums/DRMType$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lexpo/modules/video/enums/DRMType;",
        ">;",
        "Lexpo/modules/kotlin/types/Enumerable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\u0011"
    }
    d2 = {
        "Lexpo/modules/video/enums/DRMType;",
        "Lexpo/modules/kotlin/types/Enumerable;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "CLEARKEY",
        "FAIRPLAY",
        "PLAYREADY",
        "WIDEVINE",
        "isSupported",
        "",
        "toUUID",
        "Ljava/util/UUID;",
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

.field private static final synthetic $VALUES:[Lexpo/modules/video/enums/DRMType;

.field public static final enum CLEARKEY:Lexpo/modules/video/enums/DRMType;

.field public static final enum FAIRPLAY:Lexpo/modules/video/enums/DRMType;

.field public static final enum PLAYREADY:Lexpo/modules/video/enums/DRMType;

.field public static final enum WIDEVINE:Lexpo/modules/video/enums/DRMType;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lexpo/modules/video/enums/DRMType;
    .locals 4

    .line 1
    sget-object v0, Lexpo/modules/video/enums/DRMType;->CLEARKEY:Lexpo/modules/video/enums/DRMType;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/video/enums/DRMType;->FAIRPLAY:Lexpo/modules/video/enums/DRMType;

    .line 4
    .line 5
    sget-object v2, Lexpo/modules/video/enums/DRMType;->PLAYREADY:Lexpo/modules/video/enums/DRMType;

    .line 6
    .line 7
    sget-object v3, Lexpo/modules/video/enums/DRMType;->WIDEVINE:Lexpo/modules/video/enums/DRMType;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [Lexpo/modules/video/enums/DRMType;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lexpo/modules/video/enums/DRMType;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "clearkey"

    .line 5
    .line 6
    const-string v3, "CLEARKEY"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/video/enums/DRMType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lexpo/modules/video/enums/DRMType;->CLEARKEY:Lexpo/modules/video/enums/DRMType;

    .line 12
    .line 13
    new-instance v0, Lexpo/modules/video/enums/DRMType;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "fairplay"

    .line 17
    .line 18
    const-string v3, "FAIRPLAY"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/video/enums/DRMType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lexpo/modules/video/enums/DRMType;->FAIRPLAY:Lexpo/modules/video/enums/DRMType;

    .line 24
    .line 25
    new-instance v0, Lexpo/modules/video/enums/DRMType;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "playready"

    .line 29
    .line 30
    const-string v3, "PLAYREADY"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/video/enums/DRMType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lexpo/modules/video/enums/DRMType;->PLAYREADY:Lexpo/modules/video/enums/DRMType;

    .line 36
    .line 37
    new-instance v0, Lexpo/modules/video/enums/DRMType;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "widevine"

    .line 41
    .line 42
    const-string v3, "WIDEVINE"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/video/enums/DRMType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lexpo/modules/video/enums/DRMType;->WIDEVINE:Lexpo/modules/video/enums/DRMType;

    .line 48
    .line 49
    invoke-static {}, Lexpo/modules/video/enums/DRMType;->$values()[Lexpo/modules/video/enums/DRMType;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Lexpo/modules/video/enums/DRMType;->$VALUES:[Lexpo/modules/video/enums/DRMType;

    .line 54
    .line 55
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Lexpo/modules/video/enums/DRMType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 60
    .line 61
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
    iput-object p3, p0, Lexpo/modules/video/enums/DRMType;->value:Ljava/lang/String;

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
    sget-object v0, Lexpo/modules/video/enums/DRMType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/video/enums/DRMType;
    .locals 1

    .line 1
    const-class v0, Lexpo/modules/video/enums/DRMType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lexpo/modules/video/enums/DRMType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lexpo/modules/video/enums/DRMType;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/video/enums/DRMType;->$VALUES:[Lexpo/modules/video/enums/DRMType;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lexpo/modules/video/enums/DRMType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/enums/DRMType;->value:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isSupported()Z
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/video/enums/DRMType;->FAIRPLAY:Lexpo/modules/video/enums/DRMType;

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final toUUID()Ljava/util/UUID;
    .locals 2

    .line 1
    sget-object v0, Lexpo/modules/video/enums/DRMType$a;->a:[I

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
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_3

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    sget-object v0, Lq2/k;->d:Ljava/util/UUID;

    .line 22
    .line 23
    const-string v1, "WIDEVINE_UUID"

    .line 24
    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_0
    new-instance v0, LTd/r;

    .line 30
    .line 31
    invoke-direct {v0}, LTd/r;-><init>()V

    .line 32
    .line 33
    .line 34
    throw v0

    .line 35
    :cond_1
    sget-object v0, Lq2/k;->e:Ljava/util/UUID;

    .line 36
    .line 37
    const-string v1, "PLAYREADY_UUID"

    .line 38
    .line 39
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_2
    new-instance v0, LFd/B;

    .line 44
    .line 45
    invoke-direct {v0, p0}, LFd/B;-><init>(Lexpo/modules/video/enums/DRMType;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_3
    sget-object v0, Lq2/k;->c:Ljava/util/UUID;

    .line 50
    .line 51
    const-string v1, "CLEARKEY_UUID"

    .line 52
    .line 53
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v0
.end method
