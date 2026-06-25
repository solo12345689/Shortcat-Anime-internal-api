.class public final LW0/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LW0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LW0/a;

    .line 2
    .line 3
    invoke-direct {v0}, LW0/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LW0/a;->a:LW0/a;

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
.method public final a(LW0/f;)Landroid/text/SegmentFinder;
    .locals 1

    .line 1
    new-instance v0, LW0/a$a;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LW0/a$a;-><init>(LW0/f;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, LV0/c;->a(Ljava/lang/Object;)Landroid/text/SegmentFinder;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method
