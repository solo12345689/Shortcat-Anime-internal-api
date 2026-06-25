.class public final synthetic Ld1/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# instance fields
.field public final synthetic a:Ls0/h0;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Ls0/h0;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld1/h;->a:Ls0/h0;

    .line 5
    .line 6
    iput-wide p2, p0, Ld1/h;->b:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ld1/h;->a:Ls0/h0;

    .line 2
    .line 3
    iget-wide v1, p0, Ld1/h;->b:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2}, Ld1/i;->a(Ls0/h0;J)Landroid/graphics/Shader;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
