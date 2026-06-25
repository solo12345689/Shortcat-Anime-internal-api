.class public final LY/w1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:LY/v1;

.field private b:LY/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LY/v1;LY/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY/w1;->a:LY/v1;

    .line 5
    .line 6
    iput-object p2, p0, LY/w1;->b:LY/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()LY/b;
    .locals 1

    .line 1
    iget-object v0, p0, LY/w1;->b:LY/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LY/v1;
    .locals 1

    .line 1
    iget-object v0, p0, LY/w1;->a:LY/v1;

    .line 2
    .line 3
    return-object v0
.end method
