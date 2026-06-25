.class public final enum LMc/a;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final enum c:LMc/a;

.field public static final enum d:LMc/a;

.field public static final enum e:LMc/a;

.field public static final enum f:LMc/a;

.field public static final enum g:LMc/a;

.field private static final synthetic h:[LMc/a;


# instance fields
.field private final a:I

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LMc/a;

    .line 2
    .line 3
    const-string v1, "UNKNOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2, v2}, LMc/a;-><init>(Ljava/lang/String;III)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LMc/a;->c:LMc/a;

    .line 10
    .line 11
    new-instance v0, LMc/a;

    .line 12
    .line 13
    const-string v1, "SPEECH"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2, v2}, LMc/a;-><init>(Ljava/lang/String;III)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LMc/a;->d:LMc/a;

    .line 20
    .line 21
    new-instance v0, LMc/a;

    .line 22
    .line 23
    const-string v1, "MUSIC"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2, v2, v2}, LMc/a;-><init>(Ljava/lang/String;III)V

    .line 27
    .line 28
    .line 29
    sput-object v0, LMc/a;->e:LMc/a;

    .line 30
    .line 31
    new-instance v0, LMc/a;

    .line 32
    .line 33
    const-string v1, "MOVIE"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2, v2, v2}, LMc/a;-><init>(Ljava/lang/String;III)V

    .line 37
    .line 38
    .line 39
    sput-object v0, LMc/a;->f:LMc/a;

    .line 40
    .line 41
    new-instance v0, LMc/a;

    .line 42
    .line 43
    const-string v1, "SONIFICIATION"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2, v2, v2}, LMc/a;-><init>(Ljava/lang/String;III)V

    .line 47
    .line 48
    .line 49
    sput-object v0, LMc/a;->g:LMc/a;

    .line 50
    .line 51
    invoke-static {}, LMc/a;->a()[LMc/a;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, LMc/a;->h:[LMc/a;

    .line 56
    .line 57
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, LMc/a;->a:I

    .line 5
    .line 6
    iput p4, p0, LMc/a;->b:I

    .line 7
    .line 8
    return-void
.end method

.method private static synthetic a()[LMc/a;
    .locals 5

    .line 1
    sget-object v0, LMc/a;->c:LMc/a;

    .line 2
    .line 3
    sget-object v1, LMc/a;->d:LMc/a;

    .line 4
    .line 5
    sget-object v2, LMc/a;->e:LMc/a;

    .line 6
    .line 7
    sget-object v3, LMc/a;->f:LMc/a;

    .line 8
    .line 9
    sget-object v4, LMc/a;->g:LMc/a;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [LMc/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public static b(I)LMc/a;
    .locals 5

    .line 1
    invoke-static {}, LMc/a;->values()[LMc/a;

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
    invoke-virtual {v3}, LMc/a;->h()I

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
    sget-object p0, LMc/a;->c:LMc/a;

    .line 22
    .line 23
    return-object p0
.end method

.method public static c(I)LMc/a;
    .locals 5

    .line 1
    invoke-static {}, LMc/a;->values()[LMc/a;

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
    invoke-virtual {v3}, LMc/a;->h()I

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
    sget-object p0, LMc/a;->c:LMc/a;

    .line 22
    .line 23
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)LMc/a;
    .locals 1

    .line 1
    const-class v0, LMc/a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LMc/a;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LMc/a;
    .locals 1

    .line 1
    sget-object v0, LMc/a;->h:[LMc/a;

    .line 2
    .line 3
    invoke-virtual {v0}, [LMc/a;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LMc/a;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public h()I
    .locals 1

    .line 1
    iget v0, p0, LMc/a;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public k()I
    .locals 1

    .line 1
    iget v0, p0, LMc/a;->a:I

    .line 2
    .line 3
    return v0
.end method
