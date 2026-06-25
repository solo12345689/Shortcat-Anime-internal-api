.class public interface abstract Lcom/google/android/gms/internal/measurement/q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final W:Lcom/google/android/gms/internal/measurement/q;

.field public static final a0:Lcom/google/android/gms/internal/measurement/q;

.field public static final b0:Lcom/google/android/gms/internal/measurement/q;

.field public static final c0:Lcom/google/android/gms/internal/measurement/q;

.field public static final d0:Lcom/google/android/gms/internal/measurement/q;

.field public static final e0:Lcom/google/android/gms/internal/measurement/q;

.field public static final f0:Lcom/google/android/gms/internal/measurement/q;

.field public static final g0:Lcom/google/android/gms/internal/measurement/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/v;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/v;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/measurement/q;->W:Lcom/google/android/gms/internal/measurement/q;

    .line 7
    .line 8
    new-instance v0, Lcom/google/android/gms/internal/measurement/o;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/o;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/google/android/gms/internal/measurement/q;->a0:Lcom/google/android/gms/internal/measurement/q;

    .line 14
    .line 15
    new-instance v0, Lcom/google/android/gms/internal/measurement/h;

    .line 16
    .line 17
    const-string v1, "continue"

    .line 18
    .line 19
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/h;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lcom/google/android/gms/internal/measurement/q;->b0:Lcom/google/android/gms/internal/measurement/q;

    .line 23
    .line 24
    new-instance v0, Lcom/google/android/gms/internal/measurement/h;

    .line 25
    .line 26
    const-string v1, "break"

    .line 27
    .line 28
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/h;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lcom/google/android/gms/internal/measurement/q;->c0:Lcom/google/android/gms/internal/measurement/q;

    .line 32
    .line 33
    new-instance v0, Lcom/google/android/gms/internal/measurement/h;

    .line 34
    .line 35
    const-string v1, "return"

    .line 36
    .line 37
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/h;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lcom/google/android/gms/internal/measurement/q;->d0:Lcom/google/android/gms/internal/measurement/q;

    .line 41
    .line 42
    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    .line 43
    .line 44
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Boolean;)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcom/google/android/gms/internal/measurement/q;->e0:Lcom/google/android/gms/internal/measurement/q;

    .line 50
    .line 51
    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    .line 52
    .line 53
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Boolean;)V

    .line 56
    .line 57
    .line 58
    sput-object v0, Lcom/google/android/gms/internal/measurement/q;->f0:Lcom/google/android/gms/internal/measurement/q;

    .line 59
    .line 60
    new-instance v0, Lcom/google/android/gms/internal/measurement/u;

    .line 61
    .line 62
    const-string v1, ""

    .line 63
    .line 64
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/u;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    sput-object v0, Lcom/google/android/gms/internal/measurement/q;->g0:Lcom/google/android/gms/internal/measurement/q;

    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public abstract k()Ljava/lang/String;
.end method

.method public abstract l()Ljava/lang/Double;
.end method

.method public abstract m()Ljava/lang/Boolean;
.end method

.method public abstract n()Ljava/util/Iterator;
.end method

.method public abstract p()Lcom/google/android/gms/internal/measurement/q;
.end method

.method public abstract r(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/Y1;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/q;
.end method
