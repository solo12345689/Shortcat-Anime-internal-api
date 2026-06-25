.class final LDb/k$k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LDb/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDb/k;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LDb/b;


# direct methods
.method constructor <init>(LDb/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LDb/k$k;->a:LDb/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ldg/D;)Ldg/D;
    .locals 2

    .line 1
    const-string v0, "requestBody"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LDb/a;

    .line 7
    .line 8
    iget-object v1, p0, LDb/k$k;->a:LDb/b;

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, LDb/a;-><init>(Ldg/D;LDb/b;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
