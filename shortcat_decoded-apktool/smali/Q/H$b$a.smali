.class final LQ/H$b$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/H$b;->c(Landroidx/compose/ui/e;LY/m;I)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LQ/F;

.field final synthetic b:LY/C0;


# direct methods
.method constructor <init>(LQ/F;LY/C0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ/H$b$a;->a:LQ/F;

    .line 2
    .line 3
    iput-object p2, p0, LQ/H$b$a;->b:LY/C0;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 3

    .line 1
    iget-object v0, p0, LQ/H$b$a;->a:LQ/F;

    .line 2
    .line 3
    iget-object v1, p0, LQ/H$b$a;->b:LY/C0;

    .line 4
    .line 5
    invoke-static {v1}, LQ/H$b;->a(LY/C0;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-static {v0, v1, v2}, LQ/G;->b(LQ/F;J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, LQ/H$b$a;->a()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Lr0/f;->d(J)Lr0/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
