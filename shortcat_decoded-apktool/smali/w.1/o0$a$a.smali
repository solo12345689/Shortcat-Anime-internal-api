.class public final Lw/o0$a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/h2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/o0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field private final a:Lw/o0$d;

.field private b:Lkotlin/jvm/functions/Function1;

.field private c:Lkotlin/jvm/functions/Function1;

.field final synthetic d:Lw/o0$a;


# direct methods
.method public constructor <init>(Lw/o0$a;Lw/o0$d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/o0$a$a;->d:Lw/o0$a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lw/o0$a$a;->a:Lw/o0$d;

    .line 7
    .line 8
    iput-object p3, p0, Lw/o0$a$a;->b:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    iput-object p4, p0, Lw/o0$a$a;->c:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/o0$a$a;->d:Lw/o0$a;

    .line 2
    .line 3
    iget-object v0, v0, Lw/o0$a;->d:Lw/o0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lw/o0;->m()Lw/o0$b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, Lw/o0$a$a;->r(Lw/o0$b;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lw/o0$a$a;->a:Lw/o0$d;

    .line 13
    .line 14
    invoke-virtual {v0}, Lw/o0$d;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public final i()Lw/o0$d;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/o0$a$a;->a:Lw/o0$d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/o0$a$a;->c:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/o0$a$a;->b:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/o0$a$a;->c:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-void
.end method

.method public final q(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/o0$a$a;->b:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-void
.end method

.method public final r(Lw/o0$b;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lw/o0$a$a;->c:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    invoke-interface {p1}, Lw/o0$b;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lw/o0$a$a;->d:Lw/o0$a;

    .line 12
    .line 13
    iget-object v1, v1, Lw/o0$a;->d:Lw/o0;

    .line 14
    .line 15
    invoke-virtual {v1}, Lw/o0;->s()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Lw/o0$a$a;->c:Lkotlin/jvm/functions/Function1;

    .line 22
    .line 23
    invoke-interface {p1}, Lw/o0$b;->b()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v2, p0, Lw/o0$a$a;->a:Lw/o0$d;

    .line 32
    .line 33
    iget-object v3, p0, Lw/o0$a$a;->b:Lkotlin/jvm/functions/Function1;

    .line 34
    .line 35
    invoke-interface {v3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lw/G;

    .line 40
    .line 41
    invoke-virtual {v2, v1, v0, p1}, Lw/o0$d;->F(Ljava/lang/Object;Ljava/lang/Object;Lw/G;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    iget-object v1, p0, Lw/o0$a$a;->a:Lw/o0$d;

    .line 46
    .line 47
    iget-object v2, p0, Lw/o0$a$a;->b:Lkotlin/jvm/functions/Function1;

    .line 48
    .line 49
    invoke-interface {v2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Lw/G;

    .line 54
    .line 55
    invoke-virtual {v1, v0, p1}, Lw/o0$d;->G(Ljava/lang/Object;Lw/G;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method
