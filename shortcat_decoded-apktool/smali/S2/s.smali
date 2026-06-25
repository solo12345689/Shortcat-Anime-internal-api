.class public final LS2/s;
.super Landroid/opengl/GLSurfaceView;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LS2/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS2/s$a;
    }
.end annotation


# static fields
.field public static final synthetic b:I


# instance fields
.field private final a:LS2/s$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, LS2/s;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    new-instance p1, LS2/s$a;

    invoke-direct {p1, p0}, LS2/s$a;-><init>(Landroid/opengl/GLSurfaceView;)V

    iput-object p1, p0, LS2/s;->a:LS2/s$a;

    const/4 p2, 0x1

    .line 4
    invoke-virtual {p0, p2}, Landroid/opengl/GLSurfaceView;->setPreserveEGLContextOnPause(Z)V

    const/4 p2, 0x2

    .line 5
    invoke-virtual {p0, p2}, Landroid/opengl/GLSurfaceView;->setEGLContextClientVersion(I)V

    .line 6
    invoke-virtual {p0, p1}, Landroid/opengl/GLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    const/4 p1, 0x0

    .line 7
    invoke-virtual {p0, p1}, Landroid/opengl/GLSurfaceView;->setRenderMode(I)V

    return-void
.end method


# virtual methods
.method public getVideoDecoderOutputBufferRenderer()LS2/t;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    return-object p0
.end method

.method public setOutputBuffer(Lz2/i;)V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/s;->a:LS2/s$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LS2/s$a;->a(Lz2/i;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
