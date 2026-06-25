.class public final enum LMc/e;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final enum c:LMc/e;

.field public static final enum d:LMc/e;

.field public static final enum e:LMc/e;

.field public static final enum f:LMc/e;

.field private static final synthetic g:[LMc/e;


# instance fields
.field private final a:I

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, LMc/e;

    .line 2
    .line 3
    const-string v1, "PUBLIC"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3, v3}, LMc/e;-><init>(Ljava/lang/String;III)V

    .line 8
    .line 9
    .line 10
    sput-object v0, LMc/e;->c:LMc/e;

    .line 11
    .line 12
    new-instance v0, LMc/e;

    .line 13
    .line 14
    const-string v1, "PRIVATE"

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    invoke-direct {v0, v1, v3, v2, v4}, LMc/e;-><init>(Ljava/lang/String;III)V

    .line 18
    .line 19
    .line 20
    sput-object v0, LMc/e;->d:LMc/e;

    .line 21
    .line 22
    new-instance v0, LMc/e;

    .line 23
    .line 24
    const-string v1, "SECRET"

    .line 25
    .line 26
    const/4 v5, -0x1

    .line 27
    const/4 v6, 0x3

    .line 28
    invoke-direct {v0, v1, v4, v5, v6}, LMc/e;-><init>(Ljava/lang/String;III)V

    .line 29
    .line 30
    .line 31
    sput-object v0, LMc/e;->e:LMc/e;

    .line 32
    .line 33
    new-instance v0, LMc/e;

    .line 34
    .line 35
    const-string v1, "UNKNOWN"

    .line 36
    .line 37
    invoke-direct {v0, v1, v6, v3, v2}, LMc/e;-><init>(Ljava/lang/String;III)V

    .line 38
    .line 39
    .line 40
    sput-object v0, LMc/e;->f:LMc/e;

    .line 41
    .line 42
    invoke-static {}, LMc/e;->a()[LMc/e;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, LMc/e;->g:[LMc/e;

    .line 47
    .line 48
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, LMc/e;->a:I

    .line 5
    .line 6
    iput p4, p0, LMc/e;->b:I

    .line 7
    .line 8
    return-void
.end method

.method private static synthetic a()[LMc/e;
    .locals 4

    .line 1
    sget-object v0, LMc/e;->c:LMc/e;

    .line 2
    .line 3
    sget-object v1, LMc/e;->d:LMc/e;

    .line 4
    .line 5
    sget-object v2, LMc/e;->e:LMc/e;

    .line 6
    .line 7
    sget-object v3, LMc/e;->f:LMc/e;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [LMc/e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public static b(I)LMc/e;
    .locals 5

    .line 1
    invoke-static {}, LMc/e;->values()[LMc/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_1

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    invoke-virtual {v3}, LMc/e;->h()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-ne v4, p0, :cond_0

    .line 16
    .line 17
    return-object v3

    .line 18
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    sget-object p0, LMc/e;->f:LMc/e;

    .line 22
    .line 23
    return-object p0
.end method

.method public static c(I)LMc/e;
    .locals 5

    .line 1
    invoke-static {}, LMc/e;->values()[LMc/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_1

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    invoke-virtual {v3}, LMc/e;->k()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-ne v4, p0, :cond_0

    .line 16
    .line 17
    return-object v3

    .line 18
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    sget-object p0, LMc/e;->f:LMc/e;

    .line 22
    .line 23
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)LMc/e;
    .locals 1

    .line 1
    const-class v0, LMc/e;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LMc/e;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LMc/e;
    .locals 1

    .line 1
    sget-object v0, LMc/e;->g:[LMc/e;

    .line 2
    .line 3
    invoke-virtual {v0}, [LMc/e;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LMc/e;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public h()I
    .locals 1

    .line 1
    iget v0, p0, LMc/e;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public k()I
    .locals 1

    .line 1
    iget v0, p0, LMc/e;->a:I

    .line 2
    .line 3
    return v0
.end method
