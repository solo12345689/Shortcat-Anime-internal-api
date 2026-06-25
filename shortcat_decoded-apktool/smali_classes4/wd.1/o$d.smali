.class public final enum Lwd/o$d;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwd/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation


# static fields
.field public static final enum b:Lwd/o$d;

.field public static final enum c:Lwd/o$d;

.field public static final enum d:Lwd/o$d;

.field public static final enum e:Lwd/o$d;

.field public static final enum f:Lwd/o$d;

.field private static final synthetic g:[Lwd/o$d;

.field private static final synthetic h:Lkotlin/enums/EnumEntries;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lwd/o$d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "noUpdateAvailableOnServer"

    .line 5
    .line 6
    const-string v3, "NO_UPDATE_AVAILABLE_ON_SERVER"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lwd/o$d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lwd/o$d;->b:Lwd/o$d;

    .line 12
    .line 13
    new-instance v0, Lwd/o$d;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "updateRejectedBySelectionPolicy"

    .line 17
    .line 18
    const-string v3, "UPDATE_REJECTED_BY_SELECTION_POLICY"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lwd/o$d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lwd/o$d;->c:Lwd/o$d;

    .line 24
    .line 25
    new-instance v0, Lwd/o$d;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "updatePreviouslyFailed"

    .line 29
    .line 30
    const-string v3, "UPDATE_PREVIOUSLY_FAILED"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lwd/o$d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lwd/o$d;->d:Lwd/o$d;

    .line 36
    .line 37
    new-instance v0, Lwd/o$d;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "rollbackRejectedBySelectionPolicy"

    .line 41
    .line 42
    const-string v3, "ROLLBACK_REJECTED_BY_SELECTION_POLICY"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v2}, Lwd/o$d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lwd/o$d;->e:Lwd/o$d;

    .line 48
    .line 49
    new-instance v0, Lwd/o$d;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    const-string v2, "rollbackNoEmbeddedConfiguration"

    .line 53
    .line 54
    const-string v3, "ROLLBACK_NO_EMBEDDED"

    .line 55
    .line 56
    invoke-direct {v0, v3, v1, v2}, Lwd/o$d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lwd/o$d;->f:Lwd/o$d;

    .line 60
    .line 61
    invoke-static {}, Lwd/o$d;->a()[Lwd/o$d;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lwd/o$d;->g:[Lwd/o$d;

    .line 66
    .line 67
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Lwd/o$d;->h:Lkotlin/enums/EnumEntries;

    .line 72
    .line 73
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lwd/o$d;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private static final synthetic a()[Lwd/o$d;
    .locals 5

    .line 1
    sget-object v0, Lwd/o$d;->b:Lwd/o$d;

    .line 2
    .line 3
    sget-object v1, Lwd/o$d;->c:Lwd/o$d;

    .line 4
    .line 5
    sget-object v2, Lwd/o$d;->d:Lwd/o$d;

    .line 6
    .line 7
    sget-object v3, Lwd/o$d;->e:Lwd/o$d;

    .line 8
    .line 9
    sget-object v4, Lwd/o$d;->f:Lwd/o$d;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [Lwd/o$d;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lwd/o$d;
    .locals 1

    .line 1
    const-class v0, Lwd/o$d;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lwd/o$d;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lwd/o$d;
    .locals 1

    .line 1
    sget-object v0, Lwd/o$d;->g:[Lwd/o$d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lwd/o$d;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lwd/o$d;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
