.class public final enum Lnd/f;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final enum a:Lnd/f;

.field public static final enum b:Lnd/f;

.field public static final enum c:Lnd/f;

.field public static final enum d:Lnd/f;

.field private static final synthetic e:[Lnd/f;

.field private static final synthetic f:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnd/f;

    .line 2
    .line 3
    const-string v1, "VALID"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnd/f;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnd/f;->a:Lnd/f;

    .line 10
    .line 11
    new-instance v0, Lnd/f;

    .line 12
    .line 13
    const-string v1, "INVALID_NOT_ENABLED"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lnd/f;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lnd/f;->b:Lnd/f;

    .line 20
    .line 21
    new-instance v0, Lnd/f;

    .line 22
    .line 23
    const-string v1, "INVALID_MISSING_URL"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lnd/f;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lnd/f;->c:Lnd/f;

    .line 30
    .line 31
    new-instance v0, Lnd/f;

    .line 32
    .line 33
    const-string v1, "INVALID_MISSING_RUNTIME_VERSION"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lnd/f;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lnd/f;->d:Lnd/f;

    .line 40
    .line 41
    invoke-static {}, Lnd/f;->a()[Lnd/f;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lnd/f;->e:[Lnd/f;

    .line 46
    .line 47
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lnd/f;->f:Lkotlin/enums/EnumEntries;

    .line 52
    .line 53
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final synthetic a()[Lnd/f;
    .locals 4

    .line 1
    sget-object v0, Lnd/f;->a:Lnd/f;

    .line 2
    .line 3
    sget-object v1, Lnd/f;->b:Lnd/f;

    .line 4
    .line 5
    sget-object v2, Lnd/f;->c:Lnd/f;

    .line 6
    .line 7
    sget-object v3, Lnd/f;->d:Lnd/f;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [Lnd/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnd/f;
    .locals 1

    .line 1
    const-class v0, Lnd/f;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnd/f;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnd/f;
    .locals 1

    .line 1
    sget-object v0, Lnd/f;->e:[Lnd/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnd/f;

    .line 8
    .line 9
    return-object v0
.end method
