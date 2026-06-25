.class public final Lrf/b$a$a;
.super Lqf/u0$c$a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrf/b$a;->k0(Lrf/b;Luf/j;)Lqf/u0$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lrf/b;

.field final synthetic b:Lqf/G0;


# direct methods
.method constructor <init>(Lrf/b;Lqf/G0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrf/b$a$a;->a:Lrf/b;

    .line 2
    .line 3
    iput-object p2, p0, Lrf/b$a$a;->b:Lqf/G0;

    .line 4
    .line 5
    invoke-direct {p0}, Lqf/u0$c$a;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lqf/u0;Luf/i;)Luf/j;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lrf/b$a$a;->b(Lqf/u0;Luf/i;)Luf/k;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b(Lqf/u0;Luf/i;)Luf/k;
    .locals 2

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "type"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lrf/b$a$a;->a:Lrf/b;

    .line 12
    .line 13
    iget-object v0, p0, Lrf/b$a$a;->b:Lqf/G0;

    .line 14
    .line 15
    invoke-interface {p1, p2}, Luf/r;->v(Luf/i;)Luf/j;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType"

    .line 20
    .line 21
    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    check-cast p2, Lqf/S;

    .line 25
    .line 26
    sget-object v1, Lqf/N0;->e:Lqf/N0;

    .line 27
    .line 28
    invoke-virtual {v0, p2, v1}, Lqf/G0;->n(Lqf/S;Lqf/N0;)Lqf/S;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    const-string v0, "safeSubstitute(...)"

    .line 33
    .line 34
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, p2}, Lrf/b;->d(Luf/i;)Luf/k;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-object p1
.end method
