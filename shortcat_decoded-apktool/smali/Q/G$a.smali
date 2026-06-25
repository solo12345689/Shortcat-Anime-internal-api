.class final LQ/G$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LQ/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/G;->a(ZLg1/i;LQ/F;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LQ/F;

.field final synthetic b:Z


# direct methods
.method constructor <init>(LQ/F;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ/G$a;->a:LQ/F;

    .line 2
    .line 3
    iput-boolean p2, p0, LQ/G$a;->b:Z

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-object v0, p0, LQ/G$a;->a:LQ/F;

    .line 2
    .line 3
    iget-boolean v1, p0, LQ/G$a;->b:Z

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LQ/F;->G(Z)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method
