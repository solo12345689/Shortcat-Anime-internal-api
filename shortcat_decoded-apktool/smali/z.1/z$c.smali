.class public final Lz/z$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lz/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/z;-><init>(Lz/x;Lx/T;Lz/n;Lz/q;ZLD0/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz/z;


# direct methods
.method constructor <init>(Lz/z;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz/z$c;->a:Lz/z;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(JI)J
    .locals 2

    .line 1
    iget-object v0, p0, Lz/z$c;->a:Lz/z;

    .line 2
    .line 3
    invoke-static {v0, p3}, Lz/z;->j(Lz/z;I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz/z$c;->a:Lz/z;

    .line 7
    .line 8
    invoke-static {v0}, Lz/z;->f(Lz/z;)Lx/T;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lz/z$c;->a:Lz/z;

    .line 15
    .line 16
    invoke-static {v1}, Lz/z;->h(Lz/z;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iget-object p3, p0, Lz/z$c;->a:Lz/z;

    .line 23
    .line 24
    invoke-static {p3}, Lz/z;->b(Lz/z;)I

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    iget-object v1, p0, Lz/z$c;->a:Lz/z;

    .line 29
    .line 30
    invoke-static {v1}, Lz/z;->g(Lz/z;)Lkotlin/jvm/functions/Function1;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v0, p1, p2, p3, v1}, Lx/T;->c(JILkotlin/jvm/functions/Function1;)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    return-wide p1

    .line 39
    :cond_0
    iget-object v0, p0, Lz/z$c;->a:Lz/z;

    .line 40
    .line 41
    invoke-static {v0}, Lz/z;->e(Lz/z;)Lz/u;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v1, p0, Lz/z$c;->a:Lz/z;

    .line 46
    .line 47
    invoke-static {v1, v0, p1, p2, p3}, Lz/z;->i(Lz/z;Lz/u;JI)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    return-wide p1
.end method

.method public b(JI)J
    .locals 2

    .line 1
    iget-object v0, p0, Lz/z$c;->a:Lz/z;

    .line 2
    .line 3
    invoke-static {v0}, Lz/z;->e(Lz/z;)Lz/u;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lz/z$c;->a:Lz/z;

    .line 8
    .line 9
    invoke-static {v1, v0, p1, p2, p3}, Lz/z;->i(Lz/z;Lz/u;JI)J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    return-wide p1
.end method
