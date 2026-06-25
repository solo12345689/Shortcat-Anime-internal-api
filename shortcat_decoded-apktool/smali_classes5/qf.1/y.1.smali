.class public final Lqf/y;
.super Lqf/A;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lqf/w;
.implements Luf/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqf/y$a;
    }
.end annotation


# static fields
.field public static final d:Lqf/y$a;


# instance fields
.field private final b:Lqf/d0;

.field private final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lqf/y$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lqf/y$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lqf/y;->d:Lqf/y$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Lqf/d0;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lqf/A;-><init>()V

    .line 3
    iput-object p1, p0, Lqf/y;->b:Lqf/d0;

    .line 4
    iput-boolean p2, p0, Lqf/y;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(Lqf/d0;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lqf/y;-><init>(Lqf/d0;Z)V

    return-void
.end method


# virtual methods
.method public F0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqf/y;->W0()Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lqf/S;->N0()Lqf/v0;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lqf/y;->W0()Lqf/d0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lqf/S;->N0()Lqf/v0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Lqf/v0;->p()Lye/h;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    instance-of v0, v0, Lye/m0;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    return v0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    return v0
.end method

.method public O0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public bridge synthetic R0(Z)Lqf/M0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lqf/y;->U0(Z)Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public T(Lqf/S;)Lqf/S;
    .locals 1

    .line 1
    const-string v0, "replacement"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lqf/S;->Q0()Lqf/M0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-boolean v0, p0, Lqf/y;->c:Z

    .line 11
    .line 12
    invoke-static {p1, v0}, Lqf/h0;->e(Lqf/M0;Z)Lqf/M0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public bridge synthetic T0(Lqf/r0;)Lqf/M0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lqf/y;->V0(Lqf/r0;)Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public U0(Z)Lqf/d0;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lqf/y;->W0()Lqf/d0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lqf/d0;->U0(Z)Lqf/d0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    return-object p0
.end method

.method public V0(Lqf/r0;)Lqf/d0;
    .locals 2

    .line 1
    const-string v0, "newAttributes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lqf/y;

    .line 7
    .line 8
    invoke-virtual {p0}, Lqf/y;->W0()Lqf/d0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1, p1}, Lqf/d0;->V0(Lqf/r0;)Lqf/d0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-boolean v1, p0, Lqf/y;->c:Z

    .line 17
    .line 18
    invoke-direct {v0, p1, v1}, Lqf/y;-><init>(Lqf/d0;Z)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method protected W0()Lqf/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/y;->b:Lqf/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic Y0(Lqf/d0;)Lqf/A;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lqf/y;->a1(Lqf/d0;)Lqf/y;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final Z0()Lqf/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/y;->b:Lqf/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public a1(Lqf/d0;)Lqf/y;
    .locals 2

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lqf/y;

    .line 7
    .line 8
    iget-boolean v1, p0, Lqf/y;->c:Z

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, Lqf/y;-><init>(Lqf/d0;Z)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lqf/y;->W0()Lqf/d0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " & Any"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method
