.class public final LF8/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LF8/h;

.field private final b:Lcom/google/android/gms/common/util/d;

.field private c:J

.field private d:J

.field private e:Z

.field private final f:Ljava/util/Map;

.field private final g:Ljava/util/List;


# direct methods
.method constructor <init>(LF8/h;Lcom/google/android/gms/common/util/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, LF8/f;->a:LF8/h;

    .line 11
    .line 12
    iput-object p2, p0, LF8/f;->b:Lcom/google/android/gms/common/util/d;

    .line 13
    .line 14
    const-wide/32 p1, 0x1b7740

    .line 15
    .line 16
    .line 17
    iput-wide p1, p0, LF8/f;->c:J

    .line 18
    .line 19
    const-wide p1, 0xb43e9400L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    iput-wide p1, p0, LF8/f;->d:J

    .line 25
    .line 26
    new-instance p1, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, LF8/f;->f:Ljava/util/Map;

    .line 32
    .line 33
    new-instance p1, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, LF8/f;->g:Ljava/util/List;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method final a()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LF8/f;->e:Z

    .line 3
    .line 4
    return-void
.end method
