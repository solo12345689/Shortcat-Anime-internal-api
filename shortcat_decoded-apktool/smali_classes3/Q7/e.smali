.class public final enum LQ7/e;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final enum b:LQ7/e;

.field public static final enum c:LQ7/e;

.field public static final enum d:LQ7/e;

.field private static final synthetic e:[LQ7/e;

.field private static final synthetic f:Lkotlin/enums/EnumEntries;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LQ7/e;

    .line 2
    .line 3
    const-string v1, "Unknown"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, LQ7/e;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LQ7/e;->b:LQ7/e;

    .line 10
    .line 11
    new-instance v0, LQ7/e;

    .line 12
    .line 13
    const-string v1, "Rendered"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2}, LQ7/e;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LQ7/e;->c:LQ7/e;

    .line 20
    .line 21
    new-instance v0, LQ7/e;

    .line 22
    .line 23
    const-string v1, "None"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2, v2}, LQ7/e;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v0, LQ7/e;->d:LQ7/e;

    .line 30
    .line 31
    invoke-static {}, LQ7/e;->a()[LQ7/e;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, LQ7/e;->e:[LQ7/e;

    .line 36
    .line 37
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, LQ7/e;->f:Lkotlin/enums/EnumEntries;

    .line 42
    .line 43
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, LQ7/e;->a:I

    .line 5
    .line 6
    return-void
.end method

.method private static final synthetic a()[LQ7/e;
    .locals 3

    .line 1
    sget-object v0, LQ7/e;->b:LQ7/e;

    .line 2
    .line 3
    sget-object v1, LQ7/e;->c:LQ7/e;

    .line 4
    .line 5
    sget-object v2, LQ7/e;->d:LQ7/e;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [LQ7/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LQ7/e;
    .locals 1

    .line 1
    const-class v0, LQ7/e;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LQ7/e;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LQ7/e;
    .locals 1

    .line 1
    sget-object v0, LQ7/e;->e:[LQ7/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LQ7/e;

    .line 8
    .line 9
    return-object v0
.end method
