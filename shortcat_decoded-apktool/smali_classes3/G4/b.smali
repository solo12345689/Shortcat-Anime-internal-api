.class public final enum LG4/b;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final enum c:LG4/b;

.field public static final enum d:LG4/b;

.field public static final enum e:LG4/b;

.field public static final enum f:LG4/b;

.field private static final synthetic g:[LG4/b;


# instance fields
.field private final a:Z

.field private final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, LG4/b;

    .line 2
    .line 3
    const-string v1, "ENABLED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3, v3}, LG4/b;-><init>(Ljava/lang/String;IZZ)V

    .line 8
    .line 9
    .line 10
    sput-object v0, LG4/b;->c:LG4/b;

    .line 11
    .line 12
    new-instance v0, LG4/b;

    .line 13
    .line 14
    const-string v1, "READ_ONLY"

    .line 15
    .line 16
    invoke-direct {v0, v1, v3, v3, v2}, LG4/b;-><init>(Ljava/lang/String;IZZ)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LG4/b;->d:LG4/b;

    .line 20
    .line 21
    new-instance v0, LG4/b;

    .line 22
    .line 23
    const-string v1, "WRITE_ONLY"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v0, v1, v4, v2, v3}, LG4/b;-><init>(Ljava/lang/String;IZZ)V

    .line 27
    .line 28
    .line 29
    sput-object v0, LG4/b;->e:LG4/b;

    .line 30
    .line 31
    new-instance v0, LG4/b;

    .line 32
    .line 33
    const-string v1, "DISABLED"

    .line 34
    .line 35
    const/4 v3, 0x3

    .line 36
    invoke-direct {v0, v1, v3, v2, v2}, LG4/b;-><init>(Ljava/lang/String;IZZ)V

    .line 37
    .line 38
    .line 39
    sput-object v0, LG4/b;->f:LG4/b;

    .line 40
    .line 41
    invoke-static {}, LG4/b;->a()[LG4/b;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, LG4/b;->g:[LG4/b;

    .line 46
    .line 47
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-boolean p3, p0, LG4/b;->a:Z

    .line 5
    .line 6
    iput-boolean p4, p0, LG4/b;->b:Z

    .line 7
    .line 8
    return-void
.end method

.method private static final synthetic a()[LG4/b;
    .locals 4

    .line 1
    sget-object v0, LG4/b;->c:LG4/b;

    .line 2
    .line 3
    sget-object v1, LG4/b;->d:LG4/b;

    .line 4
    .line 5
    sget-object v2, LG4/b;->e:LG4/b;

    .line 6
    .line 7
    sget-object v3, LG4/b;->f:LG4/b;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [LG4/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LG4/b;
    .locals 1

    .line 1
    const-class v0, LG4/b;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LG4/b;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LG4/b;
    .locals 1

    .line 1
    sget-object v0, LG4/b;->g:[LG4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LG4/b;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LG4/b;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LG4/b;->b:Z

    .line 2
    .line 3
    return v0
.end method
