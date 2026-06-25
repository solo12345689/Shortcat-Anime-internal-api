.class final Lw/A;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lw/z;


# instance fields
.field private final a:Lw/I;


# direct methods
.method public constructor <init>(Lw/I;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw/A;->a:Lw/I;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lw/s0;)Lw/x0;
    .locals 1

    .line 1
    new-instance p1, Lw/B0;

    .line 2
    .line 3
    iget-object v0, p0, Lw/A;->a:Lw/I;

    .line 4
    .line 5
    invoke-direct {p1, v0}, Lw/B0;-><init>(Lw/I;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method
