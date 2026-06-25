.class public final Ly4/b$e;
.super Ltg/p;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly4/b;-><init>(Ltg/o;Ltg/P;LGf/K;JII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>(Ltg/o;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ltg/p;-><init>(Ltg/o;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public p(Ltg/P;Z)Ltg/X;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ltg/P;->n()Ltg/P;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ltg/o;->d(Ltg/P;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-super {p0, p1, p2}, Ltg/p;->p(Ltg/P;Z)Ltg/X;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method
