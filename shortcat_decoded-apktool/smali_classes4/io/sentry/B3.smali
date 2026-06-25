.class public final Lio/sentry/B3;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/B3$a;
    }
.end annotation


# static fields
.field private static final u:Ljava/util/List;


# instance fields
.field private a:Ljava/lang/Double;

.field private b:Ljava/lang/Double;

.field private c:Ljava/util/Set;

.field private d:Ljava/util/Set;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Lio/sentry/B3$a;

.field private h:I

.field private i:J

.field private j:J

.field private k:J

.field private l:Z

.field private m:Lio/sentry/protocol/r;

.field private n:Z

.field private o:Lio/sentry/S1;

.field private p:Ljava/util/List;

.field private q:Ljava/util/List;

.field private r:Z

.field private s:Ljava/util/List;

.field private t:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "Content-Length"

    .line 2
    .line 3
    const-string v1, "Accept"

    .line 4
    .line 5
    const-string v2, "Content-Type"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lio/sentry/B3;->u:Ljava/util/List;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(ZLio/sentry/protocol/r;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/B3;->c:Ljava/util/Set;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lio/sentry/B3;->d:Ljava/util/Set;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lio/sentry/B3;->e:Ljava/lang/String;

    .line 20
    .line 21
    iput-object v0, p0, Lio/sentry/B3;->f:Ljava/lang/String;

    .line 22
    .line 23
    sget-object v0, Lio/sentry/B3$a;->MEDIUM:Lio/sentry/B3$a;

    .line 24
    .line 25
    iput-object v0, p0, Lio/sentry/B3;->g:Lio/sentry/B3$a;

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    iput v0, p0, Lio/sentry/B3;->h:I

    .line 29
    .line 30
    const-wide/16 v1, 0x7530

    .line 31
    .line 32
    iput-wide v1, p0, Lio/sentry/B3;->i:J

    .line 33
    .line 34
    const-wide/16 v1, 0x1388

    .line 35
    .line 36
    iput-wide v1, p0, Lio/sentry/B3;->j:J

    .line 37
    .line 38
    const-wide/32 v1, 0x36ee80

    .line 39
    .line 40
    .line 41
    iput-wide v1, p0, Lio/sentry/B3;->k:J

    .line 42
    .line 43
    iput-boolean v0, p0, Lio/sentry/B3;->l:Z

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    iput-boolean v1, p0, Lio/sentry/B3;->n:Z

    .line 47
    .line 48
    sget-object v1, Lio/sentry/S1;->PIXEL_COPY:Lio/sentry/S1;

    .line 49
    .line 50
    iput-object v1, p0, Lio/sentry/B3;->o:Lio/sentry/S1;

    .line 51
    .line 52
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 53
    .line 54
    iput-object v1, p0, Lio/sentry/B3;->p:Ljava/util/List;

    .line 55
    .line 56
    iput-object v1, p0, Lio/sentry/B3;->q:Ljava/util/List;

    .line 57
    .line 58
    iput-boolean v0, p0, Lio/sentry/B3;->r:Z

    .line 59
    .line 60
    sget-object v1, Lio/sentry/B3;->u:Ljava/util/List;

    .line 61
    .line 62
    iput-object v1, p0, Lio/sentry/B3;->s:Ljava/util/List;

    .line 63
    .line 64
    iput-object v1, p0, Lio/sentry/B3;->t:Ljava/util/List;

    .line 65
    .line 66
    if-nez p1, :cond_0

    .line 67
    .line 68
    invoke-virtual {p0, v0}, Lio/sentry/B3;->C(Z)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0}, Lio/sentry/B3;->B(Z)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lio/sentry/B3;->c:Ljava/util/Set;

    .line 75
    .line 76
    const-string v0, "android.webkit.WebView"

    .line 77
    .line 78
    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Lio/sentry/B3;->c:Ljava/util/Set;

    .line 82
    .line 83
    const-string v0, "android.widget.VideoView"

    .line 84
    .line 85
    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lio/sentry/B3;->c:Ljava/util/Set;

    .line 89
    .line 90
    const-string v0, "androidx.media3.ui.PlayerView"

    .line 91
    .line 92
    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Lio/sentry/B3;->c:Ljava/util/Set;

    .line 96
    .line 97
    const-string v0, "com.google.android.exoplayer2.ui.PlayerView"

    .line 98
    .line 99
    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lio/sentry/B3;->c:Ljava/util/Set;

    .line 103
    .line 104
    const-string v0, "com.google.android.exoplayer2.ui.StyledPlayerView"

    .line 105
    .line 106
    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    iput-object p2, p0, Lio/sentry/B3;->m:Lio/sentry/protocol/r;

    .line 110
    .line 111
    :cond_0
    return-void
.end method

.method public static i()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/B3;->u:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method private static z(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 10
    .line 11
    .line 12
    new-instance p0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method


# virtual methods
.method public A(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lio/sentry/B3;->n:Z

    .line 2
    .line 3
    return-void
.end method

.method public B(Z)V
    .locals 1

    .line 1
    const-string v0, "android.widget.ImageView"

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lio/sentry/B3;->a(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lio/sentry/B3;->d:Ljava/util/Set;

    .line 9
    .line 10
    invoke-interface {p1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p0, v0}, Lio/sentry/B3;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lio/sentry/B3;->c:Ljava/util/Set;

    .line 18
    .line 19
    invoke-interface {p1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public C(Z)V
    .locals 1

    .line 1
    const-string v0, "android.widget.TextView"

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lio/sentry/B3;->a(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lio/sentry/B3;->d:Ljava/util/Set;

    .line 9
    .line 10
    invoke-interface {p1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p0, v0}, Lio/sentry/B3;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lio/sentry/B3;->c:Ljava/util/Set;

    .line 18
    .line 19
    invoke-interface {p1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public D(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/sentry/B3;->a(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/B3;->e:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public E(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lio/sentry/B3;->r:Z

    .line 2
    .line 3
    return-void
.end method

.method public F(Ljava/util/List;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lio/sentry/B3;->p:Ljava/util/List;

    .line 11
    .line 12
    return-void
.end method

.method public G(Ljava/util/List;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lio/sentry/B3;->q:Ljava/util/List;

    .line 11
    .line 12
    return-void
.end method

.method public H(Ljava/util/List;)V
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/B3;->u:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lio/sentry/B3;->z(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iput-object p1, p0, Lio/sentry/B3;->s:Ljava/util/List;

    .line 8
    .line 9
    return-void
.end method

.method public I(Ljava/util/List;)V
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/B3;->u:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lio/sentry/B3;->z(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iput-object p1, p0, Lio/sentry/B3;->t:Ljava/util/List;

    .line 8
    .line 9
    return-void
.end method

.method public J(Ljava/lang/Double;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lio/sentry/util/A;->f(Ljava/lang/Double;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Lio/sentry/B3;->b:Ljava/lang/Double;

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v2, "The value "

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p1, " is not valid. Use null to disable or values >= 0.0 and <= 1.0."

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0
.end method

.method public K(Lio/sentry/B3$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/B3;->g:Lio/sentry/B3$a;

    .line 2
    .line 3
    return-void
.end method

.method public L(Lio/sentry/S1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/B3;->o:Lio/sentry/S1;

    .line 2
    .line 3
    return-void
.end method

.method public M(Lio/sentry/protocol/r;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/B3;->m:Lio/sentry/protocol/r;

    .line 2
    .line 3
    return-void
.end method

.method public N(Ljava/lang/Double;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lio/sentry/util/A;->f(Ljava/lang/Double;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Lio/sentry/B3;->a:Ljava/lang/Double;

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v2, "The value "

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p1, " is not valid. Use null to disable or values >= 0.0 and <= 1.0."

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0
.end method

.method public O(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/B3;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/B3;->c:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/B3;->d:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lio/sentry/B3;->i:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lio/sentry/B3;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public e()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/B3;->c:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/B3;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/B3;->p:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/B3;->q:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/B3;->s:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/B3;->t:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public l()Ljava/lang/Double;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/B3;->b:Ljava/lang/Double;

    .line 2
    .line 3
    return-object v0
.end method

.method public m()Lio/sentry/B3$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/B3;->g:Lio/sentry/B3$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public n()Lio/sentry/S1;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/B3;->o:Lio/sentry/S1;

    .line 2
    .line 3
    return-object v0
.end method

.method public o()Lio/sentry/protocol/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/B3;->m:Lio/sentry/protocol/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public p()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lio/sentry/B3;->k:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public q()Ljava/lang/Double;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/B3;->a:Ljava/lang/Double;

    .line 2
    .line 3
    return-object v0
.end method

.method public r()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lio/sentry/B3;->j:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public s()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/B3;->d:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public t()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/B3;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public u()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/sentry/B3;->n:Z

    .line 2
    .line 3
    return v0
.end method

.method public v()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/sentry/B3;->r:Z

    .line 2
    .line 3
    return v0
.end method

.method public w()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lio/sentry/B3;->q()Ljava/lang/Double;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lio/sentry/B3;->q()Ljava/lang/Double;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    cmpl-double v0, v0, v2

    .line 18
    .line 19
    if-lez v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public x()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lio/sentry/B3;->l()Ljava/lang/Double;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lio/sentry/B3;->l()Ljava/lang/Double;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    cmpl-double v0, v0, v2

    .line 18
    .line 19
    if-lez v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public y()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/sentry/B3;->l:Z

    .line 2
    .line 3
    return v0
.end method
