.class final Lqf/V$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqf/V;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Lqf/d0;

.field private final b:Lqf/v0;


# direct methods
.method public constructor <init>(Lqf/d0;Lqf/v0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqf/V$b;->a:Lqf/d0;

    .line 5
    .line 6
    iput-object p2, p0, Lqf/V$b;->b:Lqf/v0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Lqf/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/V$b;->a:Lqf/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lqf/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/V$b;->b:Lqf/v0;

    .line 2
    .line 3
    return-object v0
.end method
