.class public final enum Ll1/w;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final enum a:Ll1/w;

.field public static final enum b:Ll1/w;

.field private static final synthetic c:[Ll1/w;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ll1/w;

    .line 2
    .line 3
    const-string v1, "NONE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ll1/w;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ll1/w;->a:Ll1/w;

    .line 10
    .line 11
    new-instance v0, Ll1/w;

    .line 12
    .line 13
    const-string v1, "BOUNDS"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Ll1/w;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Ll1/w;->b:Ll1/w;

    .line 20
    .line 21
    invoke-static {}, Ll1/w;->a()[Ll1/w;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Ll1/w;->c:[Ll1/w;

    .line 26
    .line 27
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

.method private static final synthetic a()[Ll1/w;
    .locals 2

    .line 1
    sget-object v0, Ll1/w;->a:Ll1/w;

    .line 2
    .line 3
    sget-object v1, Ll1/w;->b:Ll1/w;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ll1/w;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ll1/w;
    .locals 1

    .line 1
    const-class v0, Ll1/w;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ll1/w;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Ll1/w;
    .locals 1

    .line 1
    sget-object v0, Ll1/w;->c:[Ll1/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ll1/w;

    .line 8
    .line 9
    return-object v0
.end method
