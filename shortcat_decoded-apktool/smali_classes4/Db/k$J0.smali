.class public final LDb/k$J0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ldg/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDb/k;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LDb/k$c;


# direct methods
.method public constructor <init>(LDb/k$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LDb/k$J0;->a:LDb/k$c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ldg/v$a;)Ldg/E;
    .locals 3

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ldg/v$a;->z()Ldg/C;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p1, v0}, Ldg/v$a;->a(Ldg/C;)Ldg/E;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Ldg/E;->Y()Ldg/E$a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, LDb/k$d;

    .line 19
    .line 20
    invoke-virtual {p1}, Ldg/E;->j()Ldg/F;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object v2, p0, LDb/k$J0;->a:LDb/k$c;

    .line 25
    .line 26
    invoke-direct {v1, p1, v2}, LDb/k$d;-><init>(Ldg/F;LDb/k$c;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ldg/E$a;->b(Ldg/F;)Ldg/E$a;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Ldg/E$a;->c()Ldg/E;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1
.end method
