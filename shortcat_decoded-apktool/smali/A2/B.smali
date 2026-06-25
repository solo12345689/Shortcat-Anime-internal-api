.class public final synthetic LA2/B;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LO9/t;


# instance fields
.field public final synthetic a:LA2/O;


# direct methods
.method public synthetic constructor <init>(LA2/O;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA2/B;->a:LA2/O;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LA2/B;->a:LA2/O;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/ExoPlayer$b;->g(LA2/O;)LA2/O;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
