.class public interface abstract LJ2/E;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LJ2/E;

.field public static final b:LJ2/E;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LJ2/C;

    .line 2
    .line 3
    invoke-direct {v0}, LJ2/C;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LJ2/E;->a:LJ2/E;

    .line 7
    .line 8
    new-instance v0, LJ2/D;

    .line 9
    .line 10
    invoke-direct {v0}, LJ2/D;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LJ2/E;->b:LJ2/E;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic a(Ljava/lang/String;ZZ)Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, LJ2/E;->a:LJ2/E;

    .line 2
    .line 3
    invoke-interface {v0, p0, p1, p2}, LJ2/E;->b(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, LJ2/N;->o(Ljava/util/List;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method


# virtual methods
.method public abstract b(Ljava/lang/String;ZZ)Ljava/util/List;
.end method
