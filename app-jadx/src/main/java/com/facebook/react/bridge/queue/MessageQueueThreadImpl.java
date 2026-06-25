package com.facebook.react.bridge.queue;

import Td.r;
import android.os.Looper;
import android.os.Process;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec;
import com.facebook.react.common.futures.SimpleSettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001eR\u0016\u0010(\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;", "Lcom/facebook/react/bridge/queue/MessageQueueThread;", "", "name", "Landroid/os/Looper;", "looper", "Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;", "exceptionHandler", "<init>", "(Ljava/lang/String;Landroid/os/Looper;Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;)V", "Ljava/lang/Runnable;", "runnable", "", "runOnQueue", "(Ljava/lang/Runnable;)Z", "T", "Ljava/util/concurrent/Callable;", "callable", "Ljava/util/concurrent/Future;", "callOnQueue", "(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;", "isOnThread", "()Z", "LTd/L;", "assertIsOnThread", "()V", "message", "(Ljava/lang/String;)V", "quitSynchronous", "isIdle", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Landroid/os/Looper;", "getLooper", "()Landroid/os/Looper;", "Lcom/facebook/react/bridge/queue/MessageQueueThreadHandler;", "handler", "Lcom/facebook/react/bridge/queue/MessageQueueThreadHandler;", "assertionErrorMessage", "isFinished", "Z", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageQueueThreadImpl implements MessageQueueThread {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String assertionErrorMessage;
    private final MessageQueueThreadHandler handler;
    private volatile boolean isFinished;
    private final Looper looper;
    private final String name;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0002J \u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl$Companion;", "", "<init>", "()V", "create", "Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;", "spec", "Lcom/facebook/react/bridge/queue/MessageQueueThreadSpec;", "exceptionHandler", "Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;", "createForMainThread", "name", "", "startNewBackgroundThread", "stackSize", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MessageQueueThreadSpec.ThreadType.values().length];
                try {
                    iArr[MessageQueueThreadSpec.ThreadType.MAIN_UI.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MessageQueueThreadSpec.ThreadType.NEW_BACKGROUND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final MessageQueueThreadImpl createForMainThread(String name, QueueThreadExceptionHandler exceptionHandler) {
            Looper mainLooper = Looper.getMainLooper();
            AbstractC5504s.g(mainLooper, "getMainLooper(...)");
            return new MessageQueueThreadImpl(name, mainLooper, exceptionHandler, null);
        }

        private final MessageQueueThreadImpl startNewBackgroundThread(String name, long stackSize, QueueThreadExceptionHandler exceptionHandler) {
            final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
            new Thread(null, new Runnable() { // from class: com.facebook.react.bridge.queue.b
                @Override // java.lang.Runnable
                public final void run() {
                    MessageQueueThreadImpl.Companion.startNewBackgroundThread$lambda$0(simpleSettableFuture);
                }
            }, "mqt_" + name, stackSize).start();
            Looper looper = (Looper) simpleSettableFuture.b();
            if (looper != null) {
                return new MessageQueueThreadImpl(name, looper, exceptionHandler, null);
            }
            throw new RuntimeException("Looper not found for thread");
        }

        public static final void startNewBackgroundThread$lambda$0(SimpleSettableFuture simpleSettableFuture) {
            Process.setThreadPriority(-4);
            Looper.prepare();
            simpleSettableFuture.c(Looper.myLooper());
            Looper.loop();
        }

        public final MessageQueueThreadImpl create(MessageQueueThreadSpec spec, QueueThreadExceptionHandler exceptionHandler) {
            AbstractC5504s.h(spec, "spec");
            AbstractC5504s.h(exceptionHandler, "exceptionHandler");
            int i10 = WhenMappings.$EnumSwitchMapping$0[spec.getThreadType().ordinal()];
            if (i10 == 1) {
                return createForMainThread(spec.getName(), exceptionHandler);
            }
            if (i10 == 2) {
                return startNewBackgroundThread(spec.getName(), spec.getStackSize(), exceptionHandler);
            }
            throw new r();
        }

        private Companion() {
        }
    }

    public /* synthetic */ MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, looper, queueThreadExceptionHandler);
    }

    public static final void callOnQueue$lambda$0(SimpleSettableFuture simpleSettableFuture, Callable callable) {
        try {
            simpleSettableFuture.c(callable.call());
        } catch (Exception e10) {
            simpleSettableFuture.d(e10);
        }
    }

    public static final MessageQueueThreadImpl create(MessageQueueThreadSpec messageQueueThreadSpec, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        return INSTANCE.create(messageQueueThreadSpec, queueThreadExceptionHandler);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void assertIsOnThread() {
        SoftAssertions.assertCondition(isOnThread(), this.assertionErrorMessage);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public <T> Future<T> callOnQueue(final Callable<T> callable) {
        AbstractC5504s.h(callable, "callable");
        final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.queue.a
            @Override // java.lang.Runnable
            public final void run() {
                MessageQueueThreadImpl.callOnQueue$lambda$0(simpleSettableFuture, callable);
            }
        });
        return simpleSettableFuture;
    }

    public final Looper getLooper() {
        return this.looper;
    }

    public final String getName() {
        return this.name;
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean isIdle() {
        return this.looper.getQueue().isIdle();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean isOnThread() {
        return this.looper.getThread() == Thread.currentThread();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void quitSynchronous() {
        this.isFinished = true;
        this.looper.quit();
        if (this.looper.getThread() != Thread.currentThread()) {
            try {
                this.looper.getThread().join();
            } catch (InterruptedException unused) {
                throw new RuntimeException("Got interrupted waiting to join thread " + this.name);
            }
        }
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean runOnQueue(Runnable runnable) {
        AbstractC5504s.h(runnable, "runnable");
        if (!this.isFinished) {
            this.handler.post(runnable);
            return true;
        }
        AbstractC7283a.I("ReactNative", "Tried to enqueue runnable on already finished thread: '" + this.name + "... dropping Runnable.");
        return false;
    }

    private MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        this.name = str;
        this.looper = looper;
        this.handler = new MessageQueueThreadHandler(looper, queueThreadExceptionHandler);
        this.assertionErrorMessage = "Expected to be called from the '" + str + "' thread!";
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void assertIsOnThread(String message) {
        AbstractC5504s.h(message, "message");
        boolean zIsOnThread = isOnThread();
        String str = this.assertionErrorMessage + " " + message;
        AbstractC5504s.g(str, "toString(...)");
        SoftAssertions.assertCondition(zIsOnThread, str);
    }
}
