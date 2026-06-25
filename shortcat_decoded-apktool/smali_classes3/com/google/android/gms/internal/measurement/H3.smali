.class public abstract Lcom/google/android/gms/internal/measurement/H3;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Lcom/google/android/gms/internal/measurement/J3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/I3;->a:Landroid/net/Uri;

    .line 2
    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/K3;->b()Lcom/google/android/gms/internal/measurement/J3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/google/android/gms/internal/measurement/H3;->a:Lcom/google/android/gms/internal/measurement/J3;

    .line 8
    .line 9
    return-void
.end method

.method public static a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object p2, Lcom/google/android/gms/internal/measurement/H3;->a:Lcom/google/android/gms/internal/measurement/J3;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-interface {p2, p0, p1, v0}, Lcom/google/android/gms/internal/measurement/J3;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method
