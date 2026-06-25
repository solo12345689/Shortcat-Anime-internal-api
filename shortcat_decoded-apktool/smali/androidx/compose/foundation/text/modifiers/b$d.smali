.class final Landroidx/compose/foundation/text/modifiers/b$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/modifiers/b;->Y(LR0/C;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/text/modifiers/b;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text/modifiers/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/b$d;->a:Landroidx/compose/foundation/text/modifiers/b;

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
.method public final a(Z)Ljava/lang/Boolean;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b$d;->a:Landroidx/compose/foundation/text/modifiers/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/b;->P1()Landroidx/compose/foundation/text/modifiers/b$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b$d;->a:Landroidx/compose/foundation/text/modifiers/b;

    .line 13
    .line 14
    invoke-static {v0}, Landroidx/compose/foundation/text/modifiers/b;->F1(Landroidx/compose/foundation/text/modifiers/b;)Lkotlin/jvm/functions/Function1;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b$d;->a:Landroidx/compose/foundation/text/modifiers/b;

    .line 21
    .line 22
    invoke-virtual {v1}, Landroidx/compose/foundation/text/modifiers/b;->P1()Landroidx/compose/foundation/text/modifiers/b$a;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b$d;->a:Landroidx/compose/foundation/text/modifiers/b;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/b;->P1()Landroidx/compose/foundation/text/modifiers/b$a;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-virtual {v0, p1}, Landroidx/compose/foundation/text/modifiers/b$a;->f(Z)V

    .line 42
    .line 43
    .line 44
    :goto_0
    iget-object p1, p0, Landroidx/compose/foundation/text/modifiers/b$d;->a:Landroidx/compose/foundation/text/modifiers/b;

    .line 45
    .line 46
    invoke-static {p1}, Landroidx/compose/foundation/text/modifiers/b;->I1(Landroidx/compose/foundation/text/modifiers/b;)V

    .line 47
    .line 48
    .line 49
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 50
    .line 51
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/modifiers/b$d;->a(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
