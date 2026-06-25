.class final Landroidx/media3/ui/TrackSelectionView$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/TrackSelectionView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field public final a:Lq2/h0$a;

.field public final b:I


# direct methods
.method public constructor <init>(Lq2/h0$a;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/ui/TrackSelectionView$c;->a:Lq2/h0$a;

    .line 5
    .line 6
    iput p2, p0, Landroidx/media3/ui/TrackSelectionView$c;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Lq2/x;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/TrackSelectionView$c;->a:Lq2/h0$a;

    .line 2
    .line 3
    iget v1, p0, Landroidx/media3/ui/TrackSelectionView$c;->b:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lq2/h0$a;->d(I)Lq2/x;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
