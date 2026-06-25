.class public final LF3/n$j;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF3/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "j"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LF3/n$j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Landroid/media/session/MediaSession$Token;

.field private c:LF3/c;

.field private d:LY3/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LF3/n$j$a;

    .line 2
    .line 3
    invoke-direct {v0}, LF3/n$j$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LF3/n$j;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>(Landroid/media/session/MediaSession$Token;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, LF3/n$j;-><init>(Landroid/media/session/MediaSession$Token;LF3/c;)V

    return-void
.end method

.method constructor <init>(Landroid/media/session/MediaSession$Token;LF3/c;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, LF3/n$j;-><init>(Landroid/media/session/MediaSession$Token;LF3/c;LY3/b;)V

    return-void
.end method

.method constructor <init>(Landroid/media/session/MediaSession$Token;LF3/c;LY3/b;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LF3/n$j;->a:Ljava/lang/Object;

    .line 5
    iput-object p1, p0, LF3/n$j;->b:Landroid/media/session/MediaSession$Token;

    .line 6
    iput-object p2, p0, LF3/n$j;->c:LF3/c;

    .line 7
    iput-object p3, p0, LF3/n$j;->d:LY3/b;

    return-void
.end method

.method public static a(Landroid/media/session/MediaSession$Token;)LF3/n$j;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, LF3/n$j;->b(Landroid/media/session/MediaSession$Token;LF3/c;)LF3/n$j;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method static b(Landroid/media/session/MediaSession$Token;LF3/c;)LF3/n$j;
    .locals 1

    .line 1
    new-instance v0, LF3/n$j;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LF3/n$j;-><init>(Landroid/media/session/MediaSession$Token;LF3/c;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method c()LF3/c;
    .locals 2

    .line 1
    iget-object v0, p0, LF3/n$j;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LF3/n$j;->c:LF3/c;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
.end method

.method public d()LY3/b;
    .locals 2

    .line 1
    iget-object v0, p0, LF3/n$j;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LF3/n$j;->d:LY3/b;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
.end method

.method public describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public e()Landroid/media/session/MediaSession$Token;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n$j;->b:Landroid/media/session/MediaSession$Token;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, LF3/n$j;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, LF3/n$j;

    .line 12
    .line 13
    iget-object v0, p0, LF3/n$j;->b:Landroid/media/session/MediaSession$Token;

    .line 14
    .line 15
    iget-object p1, p1, LF3/n$j;->b:Landroid/media/session/MediaSession$Token;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroid/media/session/MediaSession$Token;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method f(LF3/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n$j;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-object p1, p0, LF3/n$j;->c:LF3/c;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw p1
.end method

.method public g(LY3/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n$j;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-object p1, p0, LF3/n$j;->d:LY3/b;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n$j;->b:Landroid/media/session/MediaSession$Token;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/session/MediaSession$Token;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/n$j;->b:Landroid/media/session/MediaSession$Token;

    .line 2
    .line 3
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
