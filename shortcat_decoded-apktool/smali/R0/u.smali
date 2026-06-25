.class public final LR0/u;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LR0/s;

.field private final b:Li1/p;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LR0/s;Li1/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR0/u;->a:LR0/s;

    .line 5
    .line 6
    iput-object p2, p0, LR0/u;->b:Li1/p;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Li1/p;
    .locals 1

    .line 1
    iget-object v0, p0, LR0/u;->b:Li1/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LR0/s;
    .locals 1

    .line 1
    iget-object v0, p0, LR0/u;->a:LR0/s;

    .line 2
    .line 3
    return-object v0
.end method
