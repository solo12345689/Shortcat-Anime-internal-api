.class final LQ/H$b$b$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/H$b$b;->a(Lie/a;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lie/a;


# direct methods
.method constructor <init>(Lie/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ/H$b$b$a;->a:Lie/a;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(Li1/d;)J
    .locals 2

    .line 1
    iget-object p1, p0, LQ/H$b$b$a;->a:Lie/a;

    .line 2
    .line 3
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lr0/f;

    .line 8
    .line 9
    invoke-virtual {p1}, Lr0/f;->u()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Li1/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LQ/H$b$b$a;->a(Li1/d;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-static {v0, v1}, Lr0/f;->d(J)Lr0/f;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
