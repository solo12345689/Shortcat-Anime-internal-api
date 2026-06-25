.class public final Lub/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Lub/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lub/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lub/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lub/b;->a:Lub/b;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lub/a;
    .locals 1

    .line 1
    const-string v0, "category"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lub/g;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lub/g;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final b(Ljava/io/File;Ljava/lang/String;)Lub/a;
    .locals 1

    .line 1
    const-string v0, "filesDirectory"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "category"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lub/m;

    .line 12
    .line 13
    invoke-direct {v0, p2, p1}, Lub/m;-><init>(Ljava/lang/String;Ljava/io/File;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
