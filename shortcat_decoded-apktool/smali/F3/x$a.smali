.class LF3/x$a;
.super Landroid/media/VolumeProvider;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF3/x;->a()Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LF3/x;


# direct methods
.method constructor <init>(LF3/x;IIILjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF3/x$a;->a:LF3/x;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3, p4, p5}, Landroid/media/VolumeProvider;-><init>(IIILjava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onAdjustVolume(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/x$a;->a:LF3/x;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LF3/x;->b(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onSetVolumeTo(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/x$a;->a:LF3/x;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LF3/x;->c(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
