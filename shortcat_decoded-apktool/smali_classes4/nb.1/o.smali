.class final enum Lnb/o;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final enum b:Lnb/o;

.field public static final enum c:Lnb/o;

.field public static final enum d:Lnb/o;

.field private static final synthetic e:[Lnb/o;

.field private static final synthetic f:Lkotlin/enums/EnumEntries;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lnb/o;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "plain-text"

    .line 5
    .line 6
    const-string v3, "PLAIN_TEXT"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lnb/o;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lnb/o;->b:Lnb/o;

    .line 12
    .line 13
    new-instance v0, Lnb/o;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "html"

    .line 17
    .line 18
    const-string v3, "HTML"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lnb/o;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lnb/o;->c:Lnb/o;

    .line 24
    .line 25
    new-instance v0, Lnb/o;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "image"

    .line 29
    .line 30
    const-string v3, "IMAGE"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lnb/o;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lnb/o;->d:Lnb/o;

    .line 36
    .line 37
    invoke-static {}, Lnb/o;->a()[Lnb/o;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lnb/o;->e:[Lnb/o;

    .line 42
    .line 43
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lnb/o;->f:Lkotlin/enums/EnumEntries;

    .line 48
    .line 49
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lnb/o;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private static final synthetic a()[Lnb/o;
    .locals 3

    .line 1
    sget-object v0, Lnb/o;->b:Lnb/o;

    .line 2
    .line 3
    sget-object v1, Lnb/o;->c:Lnb/o;

    .line 4
    .line 5
    sget-object v2, Lnb/o;->d:Lnb/o;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lnb/o;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnb/o;
    .locals 1

    .line 1
    const-class v0, Lnb/o;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnb/o;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnb/o;
    .locals 1

    .line 1
    sget-object v0, Lnb/o;->e:[Lnb/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnb/o;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lnb/o;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
