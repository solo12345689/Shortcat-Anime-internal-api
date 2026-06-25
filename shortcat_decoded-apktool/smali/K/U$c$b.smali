.class public final LK/U$c$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lz/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/U$c;->a(Landroidx/compose/ui/e;LY/m;I)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final synthetic a:Lz/x;

.field private final b:LY/h2;

.field private final c:LY/h2;


# direct methods
.method constructor <init>(Lz/x;LK/V;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK/U$c$b;->a:Lz/x;

    .line 5
    .line 6
    new-instance p1, LK/U$c$b$b;

    .line 7
    .line 8
    invoke-direct {p1, p2}, LK/U$c$b$b;-><init>(LK/V;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, LY/U1;->d(Lie/a;)LY/h2;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, LK/U$c$b;->b:LY/h2;

    .line 16
    .line 17
    new-instance p1, LK/U$c$b$a;

    .line 18
    .line 19
    invoke-direct {p1, p2}, LK/U$c$b$a;-><init>(LK/V;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, LY/U1;->d(Lie/a;)LY/h2;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, LK/U$c$b;->c:LY/h2;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    iget-object v0, p0, LK/U$c$b;->a:Lz/x;

    .line 2
    .line 3
    invoke-interface {v0}, Lz/x;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public b(Lx/L;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LK/U$c$b;->a:Lz/x;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lz/x;->b(Lx/L;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-object v0, p0, LK/U$c$b;->c:LY/h2;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-object v0, p0, LK/U$c$b;->b:LY/h2;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public f(F)F
    .locals 1

    .line 1
    iget-object v0, p0, LK/U$c$b;->a:Lz/x;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lz/x;->f(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
